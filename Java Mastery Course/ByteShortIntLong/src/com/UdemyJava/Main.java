package com.UdemyJava;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("The minimum int value is: " + myMinIntValue);
        System.out.println("The maximum int value is: " + myMaxIntValue);
        System.out.println("Busted (Overflow) Max value = " + (myMaxIntValue + 1));
        System.out.println("Busted (Underflow) Min value = " + (myMinIntValue - 1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte mimunum value is: " + myMinByteValue);
        System.out.println("Byte maximum value is: " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short mimunum value is: " + myMinShortValue);
        System.out.println("Short maximum value is: " + myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long mimunum value is: " + myMinLongValue);
        System.out.println("Long maximum value is: " + myMaxLongValue);

        int myTotal = (myMinIntValue /2);
        //Casting, java automatically assumes the result is an int, to correct you must cast it
        byte myNewByteValue = (byte) (myMinByteValue /2);
        short nyNewShortValue = (short) (myMinShortValue / 2);

        byte myChallengeByte = 18;
        short myChallengeShort = 31767;
        int myChallengeInt = 56423579;
        long myChallengeLong = 50000L + (10L * (myChallengeInt + myChallengeByte + myChallengeShort));
        System.out.println("My Challenge result is: " + myChallengeLong);
    }
}
