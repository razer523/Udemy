package com.UdemyJava;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        //EXAMPLE
        int value = 1;
        if (value == 1){
            System.out.println("The value is 1");
        } else if(value ==2) {
            System.out.println("The value is 2");
        } else {
            System.out.println("The value is neither 1 or 2");
        }

        //EXAMPLE ABOVE IN SWITCH CASE FORM
        int switchValue = 3;
        switch(switchValue) {
            case 1:
                System.out.println("The value is 1");
                break; //HIGHLY IMPORTANT TO USE BREAKS

            case 2:
                System.out.println("The value is 2");
                break;

            case 3: case 4: case 5:
                System.out.println("The value is " + switchValue);
                break;

            default: //same as else
                System.out.println("The value is neither 1 or 2");
                break;
        }

        char letter = 'a';
        switch (letter) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("The letter you choose was " + letter);
                break;

            default:
                System.out.println("You letter is neither A, B, C, D, or E.");
        }

        //CASE SENSITIVITY CORRECTION
        String month = "January";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");

        }
    }
}
