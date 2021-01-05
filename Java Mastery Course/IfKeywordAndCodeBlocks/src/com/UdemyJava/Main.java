package com.UdemyJava;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if(score < 5000 && score > 1000) {
//            System.out.println("Your score was less than 5000 but less than 1000"); //code block, houses the code to be executed in this if statement
//        } else if (score < 1000) {
//            System.out.println("Your score was less than 1000.");
//        } else {
//            System.out.println("Got here.");
//        }

        if(gameOver == true){
            int finalScore = score + (levelCompleted * bonus); //variables can be created in the code block, variables inside are only available in code block
            finalScore+=1000;
            System.out.println("Your final score is: " + finalScore);
        }
        //cannot access finalScore here outside of the code block

        //challenge-create a new method with new values
        //challenge, solution 1
        int secondScore = 10000;
        int secondLevelCompleted = 8;
        int secondBonus = 200;
        if(gameOver == true){
            int finalScore = secondScore + (secondLevelCompleted * secondBonus); //variables can be created in the code block, variables inside are only available in code block
            System.out.println("Your final score is: " + finalScore);
        }

        //challenge solution 2, redefine the variable and not defining new variables, duplicating code opens to errors when modify code in the future
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if(gameOver == true){
            int finalScore = score + (levelCompleted * bonus); //variables can be created in the code block, variables inside are only available in code block
            System.out.println("Your final score is: " + finalScore);
        }
    }
}
