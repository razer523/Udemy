package com.UdemyJava;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1+2=3
        System.out.println("1 + 2 = " + result);
        int prevResult = result; // 1+2=3
        System.out.println("Previous result = " + prevResult);
        result = result -1;
        System.out.println("3 - 1 = " + result);
        System.out.println("Previous result = " + prevResult);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3; //remainder of 4 % 3
        System.out.println("4 % 3 = " + result);

        //result = result + 1
        result ++;
        System.out.println("1 + 1 = " + result);

        result--;
        System.out.println("2 - 1 = " + result);

        result += 2;
        System.out.println("1 + 2 = " + result);

        result *= 10;
        System.out.println("3 * 10 = " + result);

        result /= 3;
        System.out.println("30 / 3 = " + result);

        result -= 2;
        System.out.println("10 - 2 = " + result);

        //if then statement
        boolean isAlien = false;
        if (isAlien == true) {
            System.out.println("It is not an alien!");
        }
        else {System.out.println("Wait, that is an ALIEN!!!");}

        int topScore = 80;
        if(topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100.");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true.");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true.");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen.");
        }

        //ternary operator
        isCar = true;
        boolean wasCar = (isCar) ? true : false; // (condition) ? whatToDoIfTrue or whatToDoIfFalse
        if (wasCar){
            System.out.println("wasCar is true.");
        }

        double challengeVariable = 20.00D;
        double challengeSecondVariable = 80.00D;
        double challengeNumber = (challengeVariable + challengeSecondVariable) * 100.00D;
        System.out.println("Total number is: " + challengeNumber);
        double challengeRemainder = challengeNumber % 40.00D;
        System.out.println("Total remainder is: " + challengeRemainder);
        boolean remainderIsZero = (challengeRemainder == 0) ? true : false;
        System.out.println("True or false for no remainder is: " + remainderIsZero);
        if(!remainderIsZero) {
            System.out.println("Got some remainder, and you shouldn't....");
        }
    }
}
