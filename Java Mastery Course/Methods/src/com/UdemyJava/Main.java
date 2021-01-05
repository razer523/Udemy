package com.UdemyJava;

public class Main {

    public static void main(String[] args) {
        //CODE FROM PREVIOUS LESSON
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score is: " + highScore);

        String tablePosition = calculateHighScorePosition (1500);
        displayHighScorePosition("Ray", tablePosition);

        tablePosition = calculateHighScorePosition (900);
        displayHighScorePosition("Mark", tablePosition);

        tablePosition = calculateHighScorePosition (400);
        displayHighScorePosition("John", tablePosition);

        tablePosition = calculateHighScorePosition (50);
        displayHighScorePosition("Peter", tablePosition);
    }

    //new method to calculate the score, being used in the main method above
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus); //variables can be created in the code block, variables inside are only available in code block
            finalScore+=1000;
            return finalScore; //once return is hit, the method is closed
        }
            return -1; //-1 is used to indicate an error
    }

    public static void displayHighScorePosition(String playerName, String tablePosition){
        System.out.println(playerName + " managed to get into position: " + tablePosition + " on the high score table.");
    }

    public static String calculateHighScorePosition (int highScore) {
//        if (highScore >= 1000) {
//            return "1st Tier";
//        } else if (highScore >= 500) {
//            return "2nd Tier";
//        } else if (highScore >= 100) {
//            return "3rd Tier";
//        }
//        return "4th Tier";

            //ANOTHER PROCESS YOU CAN USE FOR THE ABOVE
        String position = "4th tier"; //assuming position 4 will be returned
        if (highScore >= 1000) {
            position = "1st Tier";
        } else if (highScore >= 500) {
            position = "2nd Tier";
        } else if (highScore >= 100) {
            position = "3rd Tier";
        }
        return position;
    }

}