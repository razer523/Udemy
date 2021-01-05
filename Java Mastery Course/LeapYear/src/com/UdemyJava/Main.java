package com.UdemyJava;

public class Main {

    public static void main(String[] args) {
        System.out.println(isLeapYear(1700));
        System.out.println(isLeapYear(1800));
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2100));
        System.out.println(isLeapYear(2200));
        System.out.println(isLeapYear(2300));
        System.out.println(isLeapYear(2500));
        System.out.println(isLeapYear(2600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2400));
    }

    public static boolean isLeapYear(int year){
        boolean isLeapYear=true;
        if(year <= 0 || year >= 9999) {
            isLeapYear=false;
        }else if((year % 4 != 0) || ((year % 100 == 0) && (year % 400 != 0))){
            isLeapYear=false;
        }
        return isLeapYear;
    }
}
