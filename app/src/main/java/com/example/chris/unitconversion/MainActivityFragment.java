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
import android.widget.RadioGroup;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements TextWatcher {

    private EditText mInputEditText;
    private EditText mOutputEditText;
    private RadioGroup mInputRadioGroup;

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
        inputEditText.setText("stuff");
        inputEditText.addTextChangedListener(this);

        EditText outputEditText = (EditText) view.findViewById(R.id.outputNumber);
        outputEditText.setText("morestuff");

        RadioGroup inputRadioGroup = (RadioGroup) view.findViewById(R.id.inputRadioGroup);

        mInputEditText = inputEditText;
        mOutputEditText = outputEditText;
        mInputRadioGroup = inputRadioGroup;
    }

    // TextWatcher
    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s)
    {
        Editable inputEditText = mInputEditText.getText();
        String inputString = inputEditText.toString();

        //convert to double, need try/catch in case input EditText is not a number
        String outputString;
        try
        {
            Double inputNumber = Double.parseDouble(inputString);
            double conversionFactor = 0.0;

            RadioGroup inputRadioGroup = mInputRadioGroup;
            int inputRadioButtonId = inputRadioGroup.getCheckedRadioButtonId();
            switch(inputRadioButtonId)
            {
                case R.id.psi:
                    Log.d("Chris", "psi");
                    conversionFactor = 6.0;
                    break;
                case R.id.bar:
                    Log.d("Chris", "bar");
                    conversionFactor = 3.0;
                    break;
            }

            Double outputNumber = inputNumber * conversionFactor;

            outputString = outputNumber.toString();
        }
        catch (NumberFormatException e)
        {
            outputString = "NaN";
        }


        mOutputEditText.setText(outputString);
    }
}
