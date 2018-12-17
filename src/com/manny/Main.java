package com.manny;

public class Main {

    public static void main(String[] args) {
        int myVariable = 50;
        // The entire line that reads "int myVariable = 50;" is a statement within Java
        if (myVariable == 50) {
            System.out.println("Printed");
        }


        myVariable++;
        myVariable--;
        System.out.println("This is a method");

        System.out.println("This is " +
                "another " +
                "still more.");

        int anotherVariable = 5;
        myVariable--;
        System.out.println("This is another one");
        //White Space is the space in between expressions, operators, etc.
        //Indentation is arranging a code so it's more readable
        //The concept of indenting is to make it easier for you to see the logical flow
        //of the code itself


    }
}
