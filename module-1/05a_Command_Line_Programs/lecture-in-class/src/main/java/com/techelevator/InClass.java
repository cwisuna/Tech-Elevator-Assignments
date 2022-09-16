package com.techelevator;

import java.util.Scanner;

public class InClass {

    public static void main(String[] args) {
       Scanner userInput = new Scanner(System.in) ;

        System.out.print("Please print your name: ");
        String name = userInput.nextLine();
        System.out.println("Your name is " + name);

        System.out.println("Please enter your height in cm (can have decimal places): ");
        String heightInput = userInput.nextLine();
        double height = Double.parseDouble(heightInput);

        //this can be any calculation
        height += 10;

        System.out.println("Your height could be: " + height);
    }
}
