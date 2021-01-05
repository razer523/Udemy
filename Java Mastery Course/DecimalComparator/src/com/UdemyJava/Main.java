package com.UdemyJava;

import java.text.DecimalFormat;
import java.text.Format;

public class Main {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    public static boolean areEqualByThreeDecimalPlaces(double valueOne, double valueTwo){
        boolean areTheyEqual = false;
        int newOne = (int)(valueOne * 1000);
        int newTwo = (int)(valueTwo * 1000);
        if (newOne==newTwo) {
            areTheyEqual = true;
        }
        return areTheyEqual;
    }
}
