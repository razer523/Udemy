package com.UdemyJava;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 1));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, -1, 0));
    }

    public static boolean hasEqualSum( int valueOne, int valueTwo, int valueThree){
        boolean equalSum = true;
        if((valueOne + valueTwo) != valueThree) {
            equalSum=false;
        }
        return equalSum;
    }
}
