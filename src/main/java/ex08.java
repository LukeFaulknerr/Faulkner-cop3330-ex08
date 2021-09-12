/*
    UCF COP3330 Fall 2021 Assignment 8 Solution
    Copyright 2021 Luke Faulkner
 */

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        // Variables / Objects
        Scanner readData = new Scanner(System.in);
        String numPeopleStr, numPizzaStr, numSlicesStr;

        // Prompt
        System.out.print("How many people? ");
        numPeopleStr = readData.nextLine();
        int numPeople = Integer.parseInt(numPeopleStr);

        System.out.print("How many pizzas do you have? ");
        numPizzaStr = readData.nextLine();
        int numPizza = Integer.parseInt(numPizzaStr);

        System.out.print("How many slices per pizza? ");
        numSlicesStr = readData.nextLine();
        int numSlices = Integer.parseInt(numSlicesStr);

        // Calculations
        int fullSlices = numSlices * numPizza;
        int leftover = fullSlices % numPeople;
        int slicesPerPerson = fullSlices / numPeople;

        // Output
        System.out.println(numPeople + " people with " + numPizza + " pizzas (" + fullSlices + " slices)");

        // Branch for grammatical purposes
        if (slicesPerPerson == 1)
            System.out.println("Each person gets " + slicesPerPerson + " piece of pizza.");
        else
            System.out.println("Each person gets " + slicesPerPerson + " pieces of pizza.");
        System.out.print("There are " + leftover + " leftover pieces.");
    }
}
