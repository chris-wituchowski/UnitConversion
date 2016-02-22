package com.example.chris.unitconversion.data;

import java.util.ArrayList;
import java.util.List;
import java.math.*;

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
                    new UnitData("inch", 0.0254, (10000.0/254.0), 0.0, 0.0),
                    new UnitData("foot", 0.3048, 3.28084, 0.0, 0.0),
                    new UnitData("yard", 0.9144, (10000.0/9144.0), 0.0, 0.0),
                    new UnitData("mile", 1609.344, (1.0/1609.344), 0.0, 0.0),
                    new UnitData("nautical mile", 1852, (1.0/1852.0), 0.0, 0.0),
            }),
    Temperature("Temperature",
            new UnitData[]{
                    new UnitData("Celsius", 1.0, 1.0, 0.0, 0.0),
                    new UnitData("Fahrenheit", (5.0/9.0), 1.8, (-32.0*(5.0/9.0)), 32.0),
                    new UnitData("Kelvin", 1.0, 1.0, (-273.15), 273.15),
                    new UnitData("Rankine", (5.0/9.0), 1.8, (-491.67*(5.0/9.0)), 491.67),
                    //new UnitData("Delisle", (-2.0/3.0), (-1.5), 100.0, 150.0),
                    //new UnitData("Newton", (100.0/33.0), (33.0/100.0), 0.0, 0.0),
                    //new UnitData("Reaumur", 1.25, 0.8, 0.0, 0.0),
                    //new UnitData("Romer", (40.0/21.0), (21.0/40.0), (-7.5*(40.0/21.0)), 7.5),
            }),
    Area("Area",
            new UnitData[]{
                    new UnitData("millimeter^2", 0.000001, 1000000.0, 0.0, 0.0),
                    new UnitData("centimeter^2", 0.0001, 10000.0, 0.0, 0.0),
                    new UnitData("meter^2", 1.0, 1.0, 0.0, 0.0),
                    new UnitData("kilometer^2", 1000000.0, 1.0e-6, 0.0, 0.0),
                    new UnitData("hectare", 10000.0, 1.0e-4, 0.0, 0.0),
                    new UnitData("foot^2", Math.pow(0.3048, 2.0), (1.0/Math.pow(0.3048, 2.0)), 0.0, 0.0),
                    new UnitData("inch^2", Math.pow(0.0254, 2.0), (1.0/Math.pow(0.0254, 2.0)), 0.0, 0.0),
                    new UnitData("yard^2", Math.pow(0.9144, 2.0), (1.0/Math.pow(0.9144, 2.0)), 0.0, 0.0),
                    new UnitData("mile^2", Math.pow(1609.344, 2.0), (1.0/Math.pow(1609.344, 2.0)), 0.0, 0.0),
                    new UnitData("acre", (43560.0*Math.pow(0.3048, 2.0)), (1.0/(43560.0*Math.pow(0.3048, 2.0))), 0.0, 0.0),
            }),
    Speed("Speed",
            new UnitData[]{
                    new UnitData("kilometers/hour", (1/3.6), 3.6, 0.0, 0.0),
                    new UnitData("meters/second", 1.0, 1.0, 0.0, 0.0),
                    new UnitData("miles per hour", 0.44704, (1.0/0.44704), 0.0, 0.0),
                    new UnitData("feet/second", 0.3048, (1.0/0.3048), 0.0, 0.0),
                    new UnitData("knots", (1.852/3.6), (3.6/1.852), 0.0, 0.0),
                    //new UnitData("mach", 340.29, 0.00293866, 0.0, 0.0),
            }),
    Time("Time",
            new UnitData[]{
                    new UnitData("second", 1.0, 1.0, 0.0, 0.0),
                    new UnitData("minute", 60.0, (1.0/60.0), 0.0, 0.0),
                    new UnitData("hour", 3600.0, (1.0/3600.0), 0.0, 0.0),
                    new UnitData("day", 86400.0, (1.0/86400.0), 0.0, 0.0),
                    new UnitData("week", 604800.0, (1.0/604800.0), 0.0, 0.0),
                    new UnitData("month", 2592000.0, 1.0/2592000.0, 0.0, 0.0),
                    new UnitData("year", 31536000.0, (1.0/31536000.0), 0.0, 0.0),
                    new UnitData("millisecond", 0.001, 1000.0, 0.0, 0.0),
                    new UnitData("microsecond", 1e-6, 1000000.0, 0.0, 0.0),
                    new UnitData("nanosecond", 1e-9, 1000000000.0, 0.0, 0.0),
            }),
    Volume("Volume",
            new UnitData[]{
                    new UnitData("kilometer^3", 1.0e9, 1.0e-9, 0.0, 0.0),
                    new UnitData("meter^3", 1.0, 1.0, 0.0, 0.0),
                    new UnitData("centimeter^3 - mL", 1.0e-6, 1.0e6, 0.0, 0.0),
                    new UnitData("millimeter^3", 1.0e-9, 1.0e9, 0.0, 0.0),
                    new UnitData("Liter", 0.001, 1.0e3, 0.0, 0.0),
                    new UnitData("Gallon", Math.pow(0.0254, 3.0)*231, 1/(Math.pow(0.0254, 3.0)*231), 0.0, 0.0),
                    new UnitData("Quart", ((Math.pow(0.0254, 3.0)*231)/4), 1/((Math.pow(0.0254, 3.0)*231)/4), 0.0, 0.0),
                    new UnitData("Pint", ((Math.pow(0.0254, 3.0)*231)/8), 1/((Math.pow(0.0254, 3.0)*231)/8), 0.0, 0.0),
                    new UnitData("Cup", ((Math.pow(0.0254, 3.0)*231)/16), 1/((Math.pow(0.0254, 3.0)*231)/16), 0.0, 0.0),
                    new UnitData("Fluid Oz", ((Math.pow(0.0254, 3.0)*231)/128), 1/((Math.pow(0.0254, 3.0)*231)/128), 0.0, 0.0),
                    new UnitData("Yard^3", Math.pow(0.9144, 3.0), 1/Math.pow(0.9144, 3.0), 0.0, 0.0),
                    new UnitData("Foot^3", Math.pow(0.3048, 3.0), 1/Math.pow(0.3048, 3.0), 0.0, 0.0),
                    new UnitData("Inch^3", Math.pow(0.0254, 3.0), 1/Math.pow(0.0254, 3.0), 0.0, 0.0),
                    new UnitData("Miles^3", Math.pow(1609.344, 3.0), 1/Math.pow(1609.344, 3.0), 0.0, 0.0),
            }),
    Pressure("Pressure",
            new UnitData[]{
                    new UnitData("bar", 100000.0, 0.00001, 0.0, 0.0),
                    new UnitData("Megapascal", 1000000, 0.000001, 0.0, 0.0),
                    new UnitData("Kilopascal", 1000, 0.001, 0.0, 0.0),
                    new UnitData("psi", (4.4482216152605/Math.pow(0.0254, 2.0)), (Math.pow(0.0254, 2.0)/4.4482216152605), 0.0, 0.0),
                    new UnitData("mmHg(torr)", (101325.0/760.0), (760.0/101325.0), 0.0, 0.0),
                    new UnitData("atm", 101325.0, (1.0/101325.0), 0.0, 0.0),
                    new UnitData("at", 98066.5, (1.0/98066.5), 0.0, 0.0),
            }),
    Energy("Energy",
            new UnitData[]{
                    new UnitData("Joule", 1.0, 1.0, 0.0, 0.0),
                    new UnitData("kilojoule", 1.0e-3, 1.0e3, 0.0, 0.0),
                    new UnitData("kWh", 3.6e6, 2.77e-7, 0.0, 0.0),
                    new UnitData("Watt-sec", 1.0, 1.0, 0.0, 0.0),
                    new UnitData("calorie", 4.1868, 1.0/4.1868, 0.0, 0.0),
                    new UnitData("Calorie", 4186.8, 1.0/4186.8, 0.0, 0.0),
                    new UnitData("electron Volt", 1.602176565e-19, 1.0/1.602176565e-19, 0.0, 0.0),
                    new UnitData("foot-pound", 1.3558179483314004, 1.0/1.3558179483314004, 0.0, 0.0),
                    new UnitData("therm", 1055055.85262, 1.0/1055055.85262, 0.0, 0.0),
                    new UnitData("BTU", 1055.05585262, 1.0/1055.05585262, 0.0, 0.0),
            }),

    Angle("Angle",
            new UnitData[]{
                    new UnitData("degree", 1.0, 1.0, 0.0, 0.0),
                    new UnitData("radian", (360.0/(2.0*Math.PI)), ((2.0*Math.PI)/360.0), 0.0, 0.0),
                    new UnitData("grad", 0.9, 1.0/0.9, 0.0, 0.0),
                    new UnitData("minute (')", (1.0/60.0), 60.0, 0.0, 0.0),
                    new UnitData("second ('')", (1.0/3600.0), 3600.0, 0.0, 0.0),
            }),

    Force("Force",
            new UnitData[]{
                    new UnitData("Newton", 1.0, 1.0, 0.0, 0.0),
                    new UnitData("kilonewton", 1000.0, 0.001, 0.0, 0.0),
                    new UnitData("kilogram-force", 9.80665, 1.0/9.80665, 0.0, 0.0),
                    new UnitData("gram-force", 100000.0, 0.00001, 0.0, 0.0),
                    new UnitData("dyne", 100000.0, 1.0e-5, 0.0, 0.0),
                    new UnitData("pound-force", 4.4482216152605, 1.0/4.4482216152605, 0.0, 0.0),
                    new UnitData("ounce-force", 0.27801385095378125, 1.0/0.27801385095378125, 0.0, 0.0),
            }),

    Torque("Torque",
            new UnitData[]{
                    new UnitData("Newton-meter", 1.0, 1.0, 0.0, 0.0),
                    new UnitData("foot-pound", 1.3558179483314004, 1.0/1.3558179483314004, 0.0, 0.0),
                    new UnitData("kilonewton-meter", 1000.0, 0.001, 0.0, 0.0),
                    new UnitData("inch-pound", 0.1129848290276167, 1.0/0.1129848290276167, 0.0, 0.0),
                    new UnitData("foot-ounce", 0.084738624, 11.800994078, 0.0, 0.0),
                    new UnitData("inch-ounce", 0.007061552, 141.611928936, 0.0, 0.0),
                    new UnitData("dyne-centimeter", 0.0000001, 10000000.0, 0.0, 0.0),
            }),
    Power("Power",
            new UnitData[]{
                    new UnitData("watt", 1.0, 1.0, 0.0, 0.0),
                    new UnitData("kilowatt", 1000.0, 0.001, 0.0, 0.0),
                    new UnitData("megawatt", 1000000.0, 0.000001, 0.0, 0.0),
                    new UnitData("horsepower", 745.699871582, 0.001341022, 0.0, 0.0),
                    new UnitData("pound-feet/second", 1.355817948, 0.737562149, 0.0, 0.0),
                    new UnitData("pound-feet/minute", 0.022596966, 44.253728957, 0.0, 0.0),
                    new UnitData("BTU/hour", 0.29307107, 3.412141633, 0.0, 0.0),
            }),

    Acceleration("Acceleration",
            new UnitData[]{
                    new UnitData("meter/sec^2", 1.0, 1.0, 0.0, 0.0),
                    new UnitData("foot/sec^2", 0.3048, 1.0/0.3048, 0.0, 0.0),
                    new UnitData("g", 9.80665, 1.0/9.80665, 0.0, 0.0),
                    new UnitData("centimeter/sec^2", 0.01, 100.0, 0.0, 0.0),
                    new UnitData("millimeter/sec^2", 0.001, 1000.0, 0.0, 0.0),
            }),
    Density("Density",
            new UnitData[]{
                    new UnitData("kilogram/meter^3", 1.0, 1.0, 0.0, 0.0),
                    new UnitData("gram/Liter", 1.0, 1.0, 0.0, 0.0),
                    new UnitData("gram/meter^3", 0.001, 1000.0, 0.0, 0.0),
                    new UnitData("gram/centimeter^3", 1000.0, 0.001, 0.0, 0.0),
                    new UnitData("milligram/meter^3", 0.000001, 1000000.0, 0.0, 0.0),
                    new UnitData("ounce/gallon", 0.028349523125/(Math.pow(0.0254, 3.0)*231), 1.0/(0.028349523125/(Math.pow(0.0254, 3.0)*231)), 0.0, 0.0),
                    new UnitData("pound/foot^3", 0.45359237/Math.pow(0.3048, 3.0), 1.0/(0.45359237/Math.pow(0.3048, 3.0)), 0.0, 0.0),
                    new UnitData("pound/inch^3", 0.45359237/Math.pow(0.0254, 3.0), 1.0/(0.45359237/Math.pow(0.0254, 3.0)), 0.0, 0.0),
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

            }),
    UnitPrefixes("SI Prefixes",
            new UnitData[]{
                    new UnitData("peta", 1.0e15, 1.0e-15, 0.0, 0.0),
                    new UnitData("tera", 1.0e12, 1.0e-12, 0.0, 0.0),
                    new UnitData("giga", 1.0e9, 1.0e-9, 0.0, 0.0),
                    new UnitData("mega", 1.0e6, 1.0e-6, 0.0, 0.0),
                    new UnitData("kilo", 1.0e3, 1.0e-3, 0.0, 0.0),
                    new UnitData("hecto", 1.0e2, 1.0e-2, 0.0, 0.0),
                    new UnitData("deci", 1.0e1, 1.0e-1, 0.0, 0.0),
                    new UnitData("centi", 1.0e-2, 1.0e2, 0.0, 0.0),
                    new UnitData("milli", 1.0e-3, 1.0e3, 0.0, 0.0),
                    new UnitData("micro", 1.0e-6, 1.0e6, 0.0, 0.0),
                    new UnitData("nano", 1.0e-9, 1.0e9, 0.0, 0.0),
                    new UnitData("pico", 1.0e-12, 1.0e12, 0.0, 0.0),
                    new UnitData("femto", 1.0e-15, 1.0e15, 0.0, 0.0),


                }),
    Mass("Mass",
            new UnitData[] {
                    new UnitData("kilograms", 1.0, 1.0, 0.0, 0.0),
                    new UnitData("tonne", 1000.0, 0.001, 0.0, 0.0),
                    new UnitData("decagram", 1.0, 1.0, 0.0, 0.0),
                    new UnitData("gram", 1.0, 1.0, 0.0, 0.0),
                    new UnitData("milligram", 1.0, 1.0, 0.0, 0.0),
                    new UnitData("microgram", 1.0, 1.0, 0.0, 0.0),
                    new UnitData("pound", 1.0, 1.0, 0.0, 0.0),
                    new UnitData("long ton", 1.0, 1.0, 0.0, 0.0),
                    new UnitData("short ton", 1.0, 1.0, 0.0, 0.0),
                    new UnitData("ounce", 1.0, 1.0, 0.0, 0.0),
                    new UnitData("slug", 1.0, 1.0, 0.0, 0.0),


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