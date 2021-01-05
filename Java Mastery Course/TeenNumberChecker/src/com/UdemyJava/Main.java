package com.UdemyJava;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println(isTeen(9));
        System.out.println(isTeen(13));
    }

    public static boolean hasTeen(int ageOne, int ageTwo, int ageThree){
        boolean hasTeenager = false;
        if(ageOne >= 13 && ageOne <= 19){
            hasTeenager = true;
        }
        else if(ageTwo >= 13 && ageTwo <= 19){
            hasTeenager = true;
        }
        else if(ageThree >= 13 && ageThree <= 19){
            hasTeenager = true;
        }
        return hasTeenager;
    }

    public static boolean isTeen(int age){
        boolean isTeenager = false;
        if( age >= 13 && age <= 19){
            isTeenager = true;
        }
        return isTeenager;
    }
}
