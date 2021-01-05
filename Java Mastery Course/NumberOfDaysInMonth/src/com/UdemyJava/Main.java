package com.UdemyJava;

public class Main {

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }

    public static boolean isLeapYear(int year){
        boolean isLeapYear=true;
        if(year <= 0 || year > 9999) {
            isLeapYear=false;
        }else if((year % 4 != 0) || ((year % 100 == 0) && (year % 400 != 0))){
            isLeapYear=false;
        }
        return isLeapYear;
    }

    public static int getDaysInMonth( int month, int year){
        boolean isLeapYear = isLeapYear(year);
        if(month < 1 || month > 12 || year < 1 || year > 9999){
            return -1;
        }else if(isLeapYear) {
            switch(month){
                case 1: case 3:case 5:case 7:case 8:case 10:case 12:
                    return 31;
                case 2:
                    return 29;
                case 4:case 6:case 9:case 11:
                    return 30;
                default:
                    return -1;
            }
        } else {
            switch(month){
                case 1: case 3:case 5:case 7:case 8:case 10:case 12:
                    return 31;
                case 2:
                    return 28;
                case 4:case 6:case 9:case 11:
                    return 30;
                default:
                    return -1;
            }
        }
    }
}
