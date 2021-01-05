package com.UdemyJava;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        while(count != 6) {
            System.out.println(count + " is you current value.");
            count ++;
        }

        count=1;
        while(true) {
            if(count == 6) {
                break;
            }
            System.out.println("Count value is: " + count);
            count++;
        }

        count =1;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while(count != 6);

        //OR as a for loop
//        for( count = 1; count != 6; count ++){
//            System.out.println(count + " is you current value.");
//        }

        int number = 4;
        int finishNumber = 20;
        int totalNumbers = 0;
        while (number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even Number " + number);
            totalNumbers++;
            if(totalNumbers >= 5) {
                break;
            }
        }
        System.out.println(totalNumbers + " even numbers found.");
    }

    public static boolean isEvenNumber ( int number) {
            if (number % 2 == 0) {
                return true;
            } else {
                return false;
            }
    }
}
