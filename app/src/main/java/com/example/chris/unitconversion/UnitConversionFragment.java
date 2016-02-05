package com.example.chris.unitconversion;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.util.Log;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.chris.unitconversion.data.UnitData;
import com.example.chris.unitconversion.data.UnitType;

import java.util.ArrayList;
import java.util.List;

import static java.security.AccessController.getContext;


/**
 * A placeholder fragment containing a simple view.
 */
public class UnitConversionFragment extends Fragment implements TextWatcher, RadioGroup.OnCheckedChangeListener {

    private static final String ARG_UNIT_TYPE = "ARG_UNIT_TYPE";
    private UnitType mUnitType;

    private EditText mInputEditText;
    private EditText mOutputEditText;
    private RadioGroup mInputRadioGroup;
    private RadioGroup mOutputRadioGroup;
    private List<UnitData> mUnitList;
    private String mPrecisionString = "2";


    public static UnitConversionFragment newInstance(final UnitType unitType)
    {
        Bundle arguments = new Bundle();
        arguments.putSerializable(ARG_UNIT_TYPE, unitType);
        UnitConversionFragment fragment = new UnitConversionFragment();
        fragment.setArguments(arguments);
        return fragment;
    }

    public UnitConversionFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);

        Bundle arguments =  getArguments();
        mUnitType = (UnitType)arguments.getSerializable(ARG_UNIT_TYPE);
        mUnitList = mUnitType.getUnitData();
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.unit_conversion_layout, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

            EditText inputEditText = (EditText) view.findViewById(R.id.inputNumber);
            inputEditText.addTextChangedListener(this);

            EditText outputEditText = (EditText) view.findViewById(R.id.outputNumber);

            RadioGroup inputRadioGroup = (RadioGroup) view.findViewById(R.id.inputRadioGroup);
            RadioGroup outputRadioGroup = (RadioGroup) view.findViewById(R.id.outputRadioGroup);

            inputRadioGroup.setOnCheckedChangeListener(this);
            outputRadioGroup.setOnCheckedChangeListener(this);

            mInputEditText = inputEditText;
            mOutputEditText = outputEditText;
            mInputRadioGroup = inputRadioGroup;
            mOutputRadioGroup = outputRadioGroup;

            Context context = getActivity();

            for (int i = 0; i < mUnitList.size(); i++) {
                UnitData unitData = mUnitList.get(i);

                RadioButton inButton = new RadioButton(context);
                inButton.setText(unitData.getName());
                inButton.setId(i);
            inputRadioGroup.addView(inButton);

            RadioButton outButton = new RadioButton(context);
            outButton.setText(unitData.getName());
            outButton.setId(i);
            outputRadioGroup.addView(outButton);

        }

    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        // Inflate the menu; this adds items to the action bar if it is present.

        inflater.inflate(R.menu.menu_main, menu);
        menu.add(Menu.NONE, Menu.FIRST, 101, "Precision");
        // super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        Context context = getActivity();
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
        alertDialogBuilder.setTitle("Precision");
        alertDialogBuilder.setMessage("Set Precision in Number of Digits Past the Decimal.");

        final EditText precisionText = new EditText(context);

        precisionText.setText(mPrecisionString);

        precisionText.setInputType(InputType.TYPE_CLASS_NUMBER);

        // set prompts.xml to alertdialog builder
        alertDialogBuilder.setView(precisionText);

        // set dialog message
        alertDialogBuilder.setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                Log.d("AlrtDiag", "OK");

                mPrecisionString = precisionText.getText().toString();

                Log.d("Precision", mPrecisionString);
            }
        });

        // create alert dialog
        AlertDialog alertDialog = alertDialogBuilder.create();
        // show it

        //noinspection SimplifiableIfStatement
        if (id == Menu.FIRST) {
            Log.d("actMenu", "change");
            alertDialog.show();
        }

        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        Log.d("RadioGroup", "changed");
        convertUnits();
    }

    // TextWatcher
    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int
            start, int before, int count) {
    }

    @Override
    public void afterTextChanged(Editable s) {
        convertUnits();
    }

    public void convertUnits() {
        Editable inputEditText = mInputEditText.getText();
        String inputString = inputEditText.toString();

        RadioGroup inputRadioGroup = mInputRadioGroup;
        int inputRadioButtonId = inputRadioGroup.getCheckedRadioButtonId();
        RadioGroup outputRadioGroup = mOutputRadioGroup;
        int outputRadioButtonId = outputRadioGroup.getCheckedRadioButtonId();

        Integer inputRadioButtonIdInteger = inputRadioButtonId;
        Integer outputRadioButtonIdInteger = outputRadioButtonId;

        if(inputRadioButtonIdInteger < 0 || inputRadioButtonIdInteger >= mUnitList.size())
        {
            return;
        }

        if(outputRadioButtonIdInteger < 0 || outputRadioButtonIdInteger >= mUnitList.size())
        {
            return;
        }

        Log.d("input button id", inputRadioButtonIdInteger.toString());
        Log.d("output button id", outputRadioButtonIdInteger.toString());

        UnitData inData = mUnitList.get(inputRadioButtonIdInteger);
        String inDataString = inData.getName();
        Log.d("input button unitdata", inDataString);

        UnitData outData = mUnitList.get(outputRadioButtonIdInteger);
        String outDataString = outData.getName();
        Log.d("output button unitdata", outDataString);

        //convert to double, need try/catch in case input EditText is not a number
        String outputString;
        try {
            double inputNumber = Double.parseDouble(inputString);
            double conversionFactor = 0.0;
            double initialConvertedNumber;
            String precisionFactor = "%." + mPrecisionString + "f";

            if (inputRadioButtonId == outputRadioButtonId)
            {
                outputString = inputString;
            }
            else
            {
                initialConvertedNumber = inData.toConversionFactor(inputNumber);
                Double outputNumber = outData.fromConversionFactor(initialConvertedNumber);
                outputString = String.format(precisionFactor, outputNumber);
            }

        }
        catch (NumberFormatException e) {
            outputString = "";
        }


        mOutputEditText.setText(outputString);
    }
}
