package com.techelevator;

import java.util.Scanner;

public class MultipleItems {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter several objects separated by ,: ");
        String lineInput = userInput.nextLine();
        
        String[] inputArray = lineInput.split(",");


        for (int i = 0; i < inputArray.length; i++) {
            System.out.println(inputArray[i].trim());
        }
    }
}
