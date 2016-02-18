package com.example.chris.unitconversion.data;

/**
 * Created by chris on 6/14/2015.
 */
public class UnitData {
    private String mName;
    private double mToConversionFactor;
    private double mFromConversionFactor;
    private double mToAdditionFactor;
    private double mFromAdditionFactor;
    private String mPrecisionString;

    public UnitData(String data, double toConversionFactor, double fromConversionFactor, double toAdditionFactor, double fromAdditionFactor) {
        mName = data;
        mToConversionFactor = toConversionFactor;
        mFromConversionFactor = fromConversionFactor;
        mToAdditionFactor = toAdditionFactor;
        mFromAdditionFactor = fromAdditionFactor;
    }

    public String getName() {
        return mName;
    }

    public double toConversionFactor(double value) {
        return value*mToConversionFactor+mToAdditionFactor;
    }

    public double fromConversionFactor(double value) {
        return value*mFromConversionFactor+mFromAdditionFactor;
    }

}
