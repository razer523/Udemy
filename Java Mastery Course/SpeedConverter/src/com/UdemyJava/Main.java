package com.UdemyJava;

public class Main {

    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
        printConversion(95.75);
    }

    public static void printConversion(double kilometersPerHour){
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if (milesPerHour == -1){
            System.out.println("Invalid Value");
        }else {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }

    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            long toMPH = -1;
            return toMPH;
        }
        else {
            long toMPH = Math.round(kilometersPerHour / 1.609);
            return toMPH;
        }
    }
}

//    public static void main(String[] args) {
//        System.out.println(toMilesPerHour(1.5));
//        System.out.println(toMilesPerHour(10.25));
//        System.out.println(toMilesPerHour(-5.6));
//        System.out.println(toMilesPerHour(25.42));
//        System.out.println(toMilesPerHour(75.114));
//    }
//
//    public static long toMilesPerHour(double kilometersPerHour) {
//        long roundedKilos = Math.round(kilometersPerHour);
//        if(roundedKilos < 0) {
//            return -1;
//        } else {
//            long convertedMPH=(long) (roundedKilos / 1.609);
//            return convertedMPH;
//        }
//    }