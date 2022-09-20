package com.techelevator;

import java.util.Scanner;

public class LearnJava extends SpinGenerator{

    public static void main(String[] args) {

        System.out.println("how many spins? (1-1000): ");

        Scanner scan = new Scanner(System.in);
        int spins = scan.nextInt();

        while(spins < 1 || spins > 1000){
            System.out.println("Sorry please enter vaild number of spins");
            spins = scan.nextInt();
        }
        generateSpins(spins);
        int wins = checkWins();
        System.out.println("You won " + wins + " times");
    }

}


