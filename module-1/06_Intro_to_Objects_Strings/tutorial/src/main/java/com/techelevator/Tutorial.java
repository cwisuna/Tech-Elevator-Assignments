package com.techelevator;

import java.util.Scanner;

public class Tutorial {

    public static void main(String[] args) {

        // ***********  Step 1: Use the *new* operator to create Strings on the Heap  *************
        char[] newArray = new char[] {'h', 'e', 'l', 'l', 'o', '!'};
        String greeting = new String(newArray);
        System.out.println("Greeting " + greeting);


        String salutation = new String("Welcome my friend!");
        System.out.println("Salutation: " + salutation);

        String aToast = "May the compiler rise up to meet you";
        System.out.println("Toast: " + aToast);


        // ***********  Step 2: Try out some String methods  *************

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type a sentence: ");
        String sentence = scanner.nextLine();

        System.out.println(sentence);

        //System.out.println(sentence.toLowerCase());
        //ystem.out.println(sentence.toUpperCase());

        int firstSpace = sentence.indexOf(" ");

        if(firstSpace == -1) {

            System.out.println("The first word is " + sentence.length() + " characters long.");
        } {
            System.out.println("The first word is " + firstSpace + " characters long.");


            String[] something= sentence.split(" ");
            System.out.println("The words in this sentence:");
            for (int i = 0; i < something.length  ; i++) {
                System.out.println(something[i]);
            }
        }



        // ***********  Step 3: Compare Strings  *************





    }
}
