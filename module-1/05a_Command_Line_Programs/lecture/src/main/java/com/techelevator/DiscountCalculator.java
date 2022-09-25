package com.techelevator;

import javax.print.attribute.standard.OrientationRequested;
import java.util.Scanner;

class DiscountCalculator {

    /**
     * The main method is the start and end of our program
     */
    public static void main(String[] args) {

       Scanner discountScanner = new Scanner(System.in);

        System.out.println("Welcome to the Discount Calculator");

        // Prompt the user for a discount amount
        // The answer needs to be saved as a double
        System.out.println("Enter the discount amount (w/out percentage): ");
        Double userInput = Double.parseDouble(discountScanner.nextLine())/100.0;

        // Prompt the user for a series of prices
        System.out.print("Please provide a series of prices (space separated): ");
        String prices = discountScanner.nextLine();

        String[] priceArray = prices.split(" ");

        for (int i = 0; i < priceArray.length ; i++) {

            double originalPrice = Double.parseDouble(priceArray[i]);

            double amountOff = originalPrice *   userInput;

            double salePrice = originalPrice - amountOff;

            System.out.println("Original Price was this: " + originalPrice + " Sale price is this: " + salePrice);
        }

        discountScanner.close();




    }

}
