package com.techelevator;

import java.util.Scanner;

public class InClass {

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        System.out.print("Please print your name:");
        String name = user.next();
        System.out.println("Your name is " + name);

        System.out.println("What is your height in cm (can have decimals): ");
        String heightInput = user.next();
        double height = Double.parseDouble(heightInput);

        height+= 10;

        System.out.println("Your height could be " + height);


    }
}
