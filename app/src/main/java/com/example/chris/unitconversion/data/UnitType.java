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
            }),
    Temperature("Temperature",
            new UnitData[]{
                    new UnitData("Celsius", 1.0, 1.0, 0.0, 0.0),
                    new UnitData("Fahrenheit", (5/9), 1.8, (-32.0*(5/9)), 32.0),
                    new UnitData("Kelvin", 1.0, 1.0, (-273.15), 273.15),
                    new UnitData("Rankine", (5/9), 1.8, (-491.67*(5/9)), 491.67),
                    new UnitData("Delisle", (-2/3), (-1.5), 100.0, 150.0),
                    new UnitData("Newton", (100.0/33.0), (33.0/100.0), 0.0, 0.0),
                    new UnitData("Reaumur", 1.25, 0.8, 0.0, 0.0),
                    new UnitData("Romer", (40/21), (21/40), (-7.5*(40/21)), 7.5),
            }),
    Area("Area",
            new UnitData[]{
                    new UnitData("mm^2", 6894.75729, 0.00014503, 0.0, 0.0),
                    new UnitData("cm^2", 100000.0, 0.00001, 0.0, 0.0),
                    new UnitData("m^2", 100000.0, 0.00001, 0.0, 0.0),
                    new UnitData("km^2", 100000.0, 0.00001, 0.0, 0.0),
                    new UnitData("hectare", 100000.0, 0.00001, 0.0, 0.0),
                    new UnitData("foot^2", 100000.0, 0.00001, 0.0, 0.0),
                    new UnitData("inch^2", 100000.0, 0.00001, 0.0, 0.0),
                    new UnitData("yard^2", 100000.0, 0.00001, 0.0, 0.0),
                    new UnitData("mile^2", 100000.0, 0.00001, 0.0, 0.0),
                    new UnitData("acre", 100000.0, 0.00001, 0.0, 0.0),
            }),
    Speed("Speed",
            new UnitData[]{
                    new UnitData("kilometers/hour", 6894.75729, 0.00014503, 0.0, 0.0),
                    new UnitData("meters/second", 100000.0, 0.00001, 0.0, 0.0),
                    new UnitData("miles per hour", 6894.75729, 0.00014503, 0.0, 0.0),
                    new UnitData("feet/second", 100000.0, 0.00001, 0.0, 0.0),
                    new UnitData("knots", 6894.75729, 0.00014503, 0.0, 0.0),
                    new UnitData("mach", 100000.0, 0.00001, 0.0, 0.0),
            }),
    Time("Time",
            new UnitData[]{
                    new UnitData("second", 6894.75729, 0.00014503, 0.0, 0.0),
                    new UnitData("minute", 100000.0, 0.00001, 0.0, 0.0),
                    new UnitData("hour", 6894.75729, 0.00014503, 0.0, 0.0),
                    new UnitData("day", 100000.0, 0.00001, 0.0, 0.0),
                    new UnitData("week", 6894.75729, 0.00014503, 0.0, 0.0),
                    new UnitData("month", 100000.0, 0.00001, 0.0, 0.0),
                    new UnitData("year", 6894.75729, 0.00014503, 0.0, 0.0),
                    new UnitData("millisecond", 100000.0, 0.00001, 0.0, 0.0),
                    new UnitData("microsecond", 6894.75729, 0.00014503, 0.0, 0.0),
                    new UnitData("nanosecond", 100000.0, 0.00001, 0.0, 0.0),
            }),
    Volume("Volume",
            new UnitData[]{
                    new UnitData("km^3", 6894.75729, 0.00014503, 0.0, 0.0),
                    new UnitData("m^3", 100000.0, 0.00001, 0.0, 0.0),
                    new UnitData("cm^3 - mL", 6894.75729, 0.00014503, 0.0, 0.0),
                    new UnitData("mm^3", 100000.0, 0.00001, 0.0, 0.0),
                    new UnitData("Liter", 6894.75729, 0.00014503, 0.0, 0.0),
                    new UnitData("Gallon", 100000.0, 0.00001, 0.0, 0.0),
                    new UnitData("Quart", 6894.75729, 0.00014503, 0.0, 0.0),
                    new UnitData("Pint", 100000.0, 0.00001, 0.0, 0.0),
                    new UnitData("Cup", 6894.75729, 0.00014503, 0.0, 0.0),
                    new UnitData("Fluid Oz", 100000.0, 0.00001, 0.0, 0.0),
                    new UnitData("Yard^3", 100000.0, 0.00001, 0.0, 0.0),
                    new UnitData("Foot^3", 6894.75729, 0.00014503, 0.0, 0.0),
                    new UnitData("Inch^3", 100000.0, 0.00001, 0.0, 0.0),
            }),
    Pressure("Pressure",
            new UnitData[]{
                    new UnitData("bar", 100000.0, 0.00001, 0.0, 0.0),
                    new UnitData("MPa", 1000000, 0.000001, 0.0, 0.0),
                    new UnitData("kPa", 1000, 0.001, 0.0, 0.0),
                    new UnitData("psi", 6894.75729, 0.00014503, 0.0, 0.0),
                    new UnitData("mmHg/torr", 133.3224, 0.0075006, 0.0, 0.0),
                    new UnitData("atm", 101325.0, 0.0000098692, 0.0, 0.0),
                    new UnitData("at", 98066.5, 0.000010197, 0.0, 0.0),
            }),
    Energy("Energy",
            new UnitData[]{
                    new UnitData("Joule", 6894.75729, 0.00014503, 0.0, 0.0),
                    new UnitData("kWh", 100000.0, 0.00001, 0.0, 0.0),
                    new UnitData("Watt-sec", 6894.75729, 0.00014503, 0.0, 0.0),
                    new UnitData("calorie", 100000.0, 0.00001, 0.0, 0.0),
                    new UnitData("Calorie", 6894.75729, 0.00014503, 0.0, 0.0),
                    new UnitData("eV", 100000.0, 0.00001, 0.0, 0.0),
                    new UnitData("ft-lb", 6894.75729, 0.00014503, 0.0, 0.0),
                    new UnitData("Therm", 100000.0, 0.00001, 0.0, 0.0),
                    new UnitData("BTU", 6894.75729, 0.00014503, 0.0, 0.0),
            }),

    Angle("Angle",
            new UnitData[]{
                    new UnitData("degree", 6894.75729, 0.00014503, 0.0, 0.0),
                    new UnitData("radian", 100000.0, 0.00001, 0.0, 0.0),
                    new UnitData("grad", 6894.75729, 0.00014503, 0.0, 0.0),
                    new UnitData("minute (')", 100000.0, 0.00001, 0.0, 0.0),
                    new UnitData("second ('')", 6894.75729, 0.00014503, 0.0, 0.0),
            }),

    Force("Force",
            new UnitData[]{
                    new UnitData("Newton", 6894.75729, 0.00014503, 0.0, 0.0),
                    new UnitData("Kilonewton", 6894.75729, 0.00014503, 0.0, 0.0),
                    new UnitData("kg-force", 100000.0, 0.00001, 0.0, 0.0),
                    new UnitData("gram-force", 100000.0, 0.00001, 0.0, 0.0),
                    new UnitData("dyne", 6894.75729, 0.00014503, 0.0, 0.0),
                    new UnitData("lb-f", 100000.0, 0.00001, 0.0, 0.0),
                    new UnitData("oz-f", 6894.75729, 0.00014503, 0.0, 0.0),
            }),

    Torque("Torque",
            new UnitData[]{
                    new UnitData("Newton-meter", 6894.75729, 0.00014503, 0.0, 0.0),
                    new UnitData("foot-pound", 100000.0, 0.00001, 0.0, 0.0),
                    new UnitData("kilonewton-meter", 6894.75729, 0.00014503, 0.0, 0.0),
                    new UnitData("inch-pound", 100000.0, 0.00001, 0.0, 0.0),
                    new UnitData("foot-ounce", 6894.75729, 0.00014503, 0.0, 0.0),
                    new UnitData("inch-ounce", 100000.0, 0.00001, 0.0, 0.0),
                    new UnitData("dyne-centimeter", 6894.75729, 0.00014503, 0.0, 0.0),
            }),
    Power("Power",
            new UnitData[]{
                    new UnitData("watt", 6894.75729, 0.00014503, 0.0, 0.0),
                    new UnitData("kilowatt", 100000.0, 0.00001, 0.0, 0.0),
                    new UnitData("megawatt", 6894.75729, 0.00014503, 0.0, 0.0),
                    new UnitData("horsepower", 100000.0, 0.00001, 0.0, 0.0),
                    new UnitData("pound-feet/second", 6894.75729, 0.00014503, 0.0, 0.0),
                    new UnitData("pound-feet/minute", 100000.0, 0.00001, 0.0, 0.0),
                    new UnitData("BTU/hour", 6894.75729, 0.00014503, 0.0, 0.0),
            }),

    Acceleration("Acceleration",
            new UnitData[]{
                    new UnitData("m/s^3", 6894.75729, 0.00014503, 0.0, 0.0),
                    new UnitData("ft/s^2", 100000.0, 0.00001, 0.0, 0.0),
                    new UnitData("g", 6894.75729, 0.00014503, 0.0, 0.0),
                    new UnitData("cm/s^2", 100000.0, 0.00001, 0.0, 0.0),
                    new UnitData("mm/s^2", 6894.75729, 0.00014503, 0.0, 0.0),
            }),
    Density("Density",
            new UnitData[]{
                    new UnitData("kg/m^3", 6894.75729, 0.00014503, 0.0, 0.0),
                    new UnitData("g/m^3", 100000.0, 0.00001, 0.0, 0.0),
                    new UnitData("g/cm^3", 6894.75729, 0.00014503, 0.0, 0.0),
                    new UnitData("mg/m^3", 100000.0, 0.00001, 0.0, 0.0),
                    new UnitData("oz/gal", 6894.75729, 0.00014503, 0.0, 0.0),
                    new UnitData("lb/ft^3", 100000.0, 0.00001, 0.0, 0.0),
                    new UnitData("lb/in^3", 6894.75729, 0.00014503, 0.0, 0.0),
            }),
    DigitalInformation("Bits/Bytes",
            new UnitData[]{
                    new UnitData("bit", 1.0, 1.0, 0.0, 0.0),
                    new UnitData("byte", 8.0, 0.125, 0.0, 0.0),
                    new UnitData("kilobit", 1000.0, 0.001, 0.0, 0.0),
                    new UnitData("kilobyte", 8000.0, 0.000125, 0.0, 0.0),
                    new UnitData("megabit", 1000000.0, 0.000001, 0.0, 0.0),
                    new UnitData("megabyte", 8000000.0, 0.000000125, 0.0, 0.0),
                    new UnitData("gigabit", 1000000000.0, 0.000000001, 0.0, 0.0),
                    new UnitData("gigabyte", 8000000000.0, 0.000000000125, 0.0, 0.0),
                    new UnitData("terabit", 1000000000000.0, 0.000000000001, 0.0, 0.0),
                    new UnitData("terabyte", 8000000000000.0, 0.000000000000125, 0.0, 0.0),
                    new UnitData("petabit", 1000000000000000.0, 0.000000000000001, 0.0, 0.0),
                    new UnitData("petabyte", 8000000000000000.0, 0.000000000000000125, 0.0, 0.0),

            });



    private String mUnitName;
    private List<UnitData> mUnitData;

    UnitType(String unitName, UnitData[] allUnitData) {
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