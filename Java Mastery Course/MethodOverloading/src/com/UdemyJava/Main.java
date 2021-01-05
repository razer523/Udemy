package com.UdemyJava;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Ray", 500);
        System.out.println("New score is: " + newScore);
        calculateScore(75);
        calculateScore();
        calcFeetAndInchesToCentimeters(6, 0);
        calcFeetAndInchesToCentimeters(159);
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored: " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored: " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player named and no points scored");
        return 0;
    }

    //CHALLENGE
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if( (feet < 0) || inches < 0 || inches > 12){
            return -1;
        }else {
            double centimeters = (feet * 12 + inches) * 2.54;
            System.out.println(feet + " feet " + inches + " inches= " + centimeters + " cm");
            return centimeters;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches < 0){
            return -1;
        }else {
            double feet = (int) inches / 12;
            double newInches = (int) inches % 12;
            return calcFeetAndInchesToCentimeters(feet, newInches);
        }
    }
}
