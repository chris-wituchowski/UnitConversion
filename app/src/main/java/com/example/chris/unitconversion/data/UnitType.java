package com.example.chris.unitconversion.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chris on 7/5/2015.
 */
public enum UnitType {

    Length("Length",
            new UnitData[]{
                    new UnitData("kilometer", 1000.0, 0.001, 0.0, 0.0),
                    new UnitData("meter", 1.0, 1.0, 0.0, 0.0),
                    new UnitData("centimeter", 0.01, 100.0, 0.0, 0.0),
                    new UnitData("millimeter", 0.001, 1000.0, 0.0, 0.0),
                    new UnitData("micrometer", 0.000001, 1000000, 0.0, 0.0),
                    new UnitData("nanometer", 0.000000001, 1000000000, 0.0, 0.0),
                    new UnitData("thou", 0.0000254, 39370.0787, 0.0, 0.0),
                    new UnitData("inch", 0.0254, (10000.0/254), 0.0, 0.0),
                    new UnitData("foot", 0.3048, 3.28084, 0.0, 0.0),
                    new UnitData("yard", 0.9144, (10000.0/9144), 0.0, 0.0),
                    new UnitData("mile", 1609.34, 0.0000621371, 0.0, 0.0),
                    new UnitData("nautical mile", 1852, 0.000539957, 0.0, 0.0),
            }
    ),
    Pressure("Pressure",
            new UnitData[]{
                new UnitData("psi", 6894.75729, 0.00014503, 0.0, 0.0),
                new UnitData("bar", 100000.0, 0.00001, 0.0, 0.0),
                new UnitData("MPa", 1000000, 0.000001, 0.0, 0.0),
                new UnitData("kPa", 1000, 0.001, 0.0, 0.0),
                new UnitData("mmHg/torr", 133.3224, 0.0075006, 0.0, 0.0),
                new UnitData("atm", 101325.0, 0.0000098692, 0.0, 0.0),
                new UnitData("at", 98066.5, 0.000010197, 0.0, 0.0),
}),
    Area("Area",
            new UnitData[]{
                    new UnitData("psi", 6894.75729, 0.00014503, 0.0, 0.0),
                    new UnitData("bar", 100000.0, 0.00001, 0.0, 0.0),
            }),
    Energy("Energy",
            new UnitData[]{
                    new UnitData("psi", 6894.75729, 0.00014503, 0.0, 0.0),
                    new UnitData("bar", 100000.0, 0.00001, 0.0, 0.0),
            });

    private String mUnitName;
    private List<UnitData> mUnitData;

    private UnitType(String unitName, UnitData[] allUnitData) {
        mUnitName = unitName;

        mUnitData = new ArrayList<>();
        for(final UnitData unitData : allUnitData)
        {
            mUnitData.add(unitData);
        }
    }

    public String getUnitName(){
        return mUnitName;
    }

    public List<UnitData> getUnitData()
    {
        return mUnitData;
    }
}