package com.example.chris.unitconversion;

import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements TextWatcher, RadioGroup.OnCheckedChangeListener {

    private EditText mInputEditText;
    private EditText mOutputEditText;
    private RadioGroup mInputRadioGroup;
    private RadioGroup mOutputRadioGroup;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
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
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        convertUnits();
    }

    public void convertUnits() {
        Editable inputEditText = mInputEditText.getText();
        String inputString = inputEditText.toString();

        //convert to double, need try/catch in case input EditText is not a number
        String outputString;
        try {
            Double inputNumber = Double.parseDouble(inputString);
            double conversionFactor = 0.0;
            double initialConvertedNumber;

            RadioGroup inputRadioGroup = mInputRadioGroup;
            int inputRadioButtonId = inputRadioGroup.getCheckedRadioButtonId();
            RadioGroup outputRadioGroup = mOutputRadioGroup;
            int outputRadioButtonId = outputRadioGroup.getCheckedRadioButtonId();

            Integer inputRadioButtonIdInteger = inputRadioButtonId;
            Integer outputRadioButtonIdInteger = outputRadioButtonId;

            Log.d("input button id", inputRadioButtonIdInteger.toString());
            Log.d("output button id", outputRadioButtonIdInteger.toString());

            if (inputRadioButtonId == outputRadioButtonId)
            {
                outputString = inputString;
            }
            else
            {
                switch (inputRadioButtonId) {
                    case R.id.inPsi:
                        Log.d("Input", "psi");
                        conversionFactor = 6894.75729;
                        break;
                    case R.id.inBar:
                        Log.d("Input", "bar");
                        conversionFactor = 100000.0;
                        break;
                    case R.id.inAt:
                        Log.d("Input", "at");
                        conversionFactor = 98066.5;
                        break;
                    case R.id.inAtm:
                        Log.d("Input", "atm");
                        conversionFactor = 101325.0;
                        break;
                    case R.id.inKPa:
                        Log.d("Input", "kpa");
                        conversionFactor = 1000;
                        break;
                    case R.id.inMPa:
                        Log.d("Input", "mpa");
                        conversionFactor = 1000000;
                        break;
                    case R.id.inTorr:
                        Log.d("Input", "torr");
                        conversionFactor = 133.3224;
                        break;
                }

                initialConvertedNumber = inputNumber * conversionFactor;

                switch (outputRadioButtonId) {
                    case R.id.outPsi:
                        Log.d("Output", "psi");
                        conversionFactor = 0.00014503;
                        break;
                    case R.id.outBar:
                        Log.d("Output", "bar");
                        conversionFactor = 0.00001;
                        break;
                    case R.id.outAt:
                        Log.d("Output", "at");
                        conversionFactor = 0.000010197;
                        break;
                    case R.id.outAtm:
                        Log.d("Output", "atm");
                        conversionFactor = 0.0000098692;
                        break;
                    case R.id.outKPa:
                        Log.d("Output", "kpa");
                        conversionFactor = 0.001;
                        break;
                    case R.id.outMPa:
                        Log.d("Output", "mpa");
                        conversionFactor = 0.000001;
                        break;
                    case R.id.outTorr:
                        Log.d("Output", "torr");
                        conversionFactor = 0.0075006;
                        break;
                }

                Double outputNumber = initialConvertedNumber * conversionFactor;

                outputString = outputNumber.toString();
            }

        }
        catch (NumberFormatException e) {
            outputString = "";
        }


        mOutputEditText.setText(outputString);
    }
}
