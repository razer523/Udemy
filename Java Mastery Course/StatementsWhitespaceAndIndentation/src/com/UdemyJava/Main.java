package com.UdemyJava;

public class Main {

    public static void main(String[] args) {
        int myVariable = 50; // the entire line is a statement, while myVariable=50 is the expression
        myVariable++; //statement
        myVariable--; //statement
        System.out.println("This entire line is also a statement");

        System.out.println("This is" +
                " another " +
                "statement spanning multiple lines."); //a statement ends at the semi colon, not line break

        System.out.println("White space is the space between words in code.");

        System.out.println("Indentation is intending your code so it is easier to read.");
    }
}
