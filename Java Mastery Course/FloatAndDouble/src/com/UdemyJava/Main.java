package com.UdemyJava;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        System.out.println("My minimum float value is: " + myMinFloatValue);
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("My maximum float value is: " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        System.out.println("My minimum double value is: " + myMinDoubleValue);
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("My maximum double value is: " + myMaxDoubleValue);

        int myIntValue = 5/3; //Int rounds down
        float myFloatValue = 5F / 3F;
        double myDoubleValue = 5D / 3D;
        System.out.println("MyIntValue is equal to: " + myIntValue);
        System.out.println("MyFloatValue is equal to: " + myFloatValue);
        System.out.println("MyDoubleValue is equal to: " + myDoubleValue);

        //convert a given number of pounds into kilograms
        double poundsToConvert = 200D;
        double kilosInAPound = 0.45359237D;
        double myConversion= poundsToConvert * kilosInAPound;
        System.out.println("Amount of kilograms in " + poundsToConvert + " pound(s), is: " + myConversion);
    }
}
