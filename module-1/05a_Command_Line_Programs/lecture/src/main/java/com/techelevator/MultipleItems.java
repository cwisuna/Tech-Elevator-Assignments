package com.techelevator;

import java.util.Scanner;

public class MultipleItems {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Please enter several objects: ");
        String carMakes = user.nextLine();

        String[] inputArray = carMakes.split( " ");

        for (int i = 0; i < inputArray.length; i++) {
            System.out.println(inputArray[i]);
        }
    }

}
