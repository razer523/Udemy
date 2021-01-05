package com.UdemyJava;

public class Main {

    public static void main(String[] args) {
        System.out.println("Your interest payment is " + calculateInterest(10000,2.0));
        System.out.println("Your interest payment is " + calculateInterest(10000,3.0));
        System.out.println("Your interest payment is " + calculateInterest(10000,4.0));
        System.out.println("Your interest payment is " + calculateInterest(10000,5.0));
        System.out.println("Your interest payment is " + calculateInterest(10000,6.0));

        //for(init; termination; increment) {}
        for (int i=2; i<=8; i++){
            System.out.println("Your interest charge is: " + String.format("%.2f", calculateInterest(10000, i)));
        }

        for (int i=8; i>=2; i--){
            System.out.println("Your new interest charge is: " + String.format("%.2f", calculateInterest(10000, i)));
        }

        int counter =0;
        for(int i=2; i < 50; i++) {
            if(isPrime(i)) {
                counter++;
                System.out.println(i + " is a prime number. This is the " + counter + " number found.");
                if (counter == 10) {
                    System.out.println("Exiting loop.");
                    break; //exits out of the for loop completely
                }
            }
        }

        int sum =0;
        for ( int i=1; i <= 1000; i++){
            if( (i % 3 == 0) && (i % 5 == 0) ) {
                sum += i;
                counter ++;
                System.out.println(i + " is divisible by 3 and 5!");
            } if (counter == 5){
                System.out.println(sum + " is the sum of the first 5 numbers divisible by 3 and 5.");
                break;
            }
        }

    }

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }
        for( int i=2; i<= n/2; i++) { //OR (int i=2; i <= (long) Math.sqrt(n); i++) to optimize the calculations
            if (n % i == 0) {
    return false;
            }
        }
        return true;
    }


    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }


}
