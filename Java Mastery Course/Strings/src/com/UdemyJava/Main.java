package com.UdemyJava;

public class Main {

    public static void main(String[] args) {
        //8 primitive data types
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

        String myString = "This is a string.";
        System.out.println("myString is equal to: " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to: " + myString);
        myString = myString + " \u00A9 2019.";
        System.out.println("myString is equal to: " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString + " Is the result when you concatenate Strings together, even if they are digits.");
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to: " + lastString + ". Because Java turns ints into strings when added to strings.");
    }
}
