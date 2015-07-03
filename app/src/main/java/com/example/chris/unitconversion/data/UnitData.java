package com.example.chris.unitconversion.data;

/**
 * Created by chris on 6/14/2015.
 */
public class UnitData {
    private String mName;
    private double mToConversionFactor;
    private double mFromConversionFactor;
    private double mAdditionFactor;

    public String getName() {
        return mName;
    }

    public UnitData(String data, double toConversionFactor, double fromConversionFactor) {
        mName = data;
        mToConversionFactor = toConversionFactor;
        mFromConversionFactor = fromConversionFactor;

    }

    public double toConversionFactor(double value) {
        return value*mToConversionFactor;
    }

    public double fromConversionFactor(double value) {
        return value*mFromConversionFactor;
    }

}
