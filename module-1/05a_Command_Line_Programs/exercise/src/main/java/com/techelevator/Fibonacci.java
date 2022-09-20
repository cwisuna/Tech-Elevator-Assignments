package com.techelevator;

import java.util.Scanner;
//The Fibonacci numbers are the integers in the following sequence:
//		0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
//		By definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the previous two:
//		0 + 1 = 1
//		1 + 1 = 2
//		1 + 2 = 3
//		2 + 3 = 5
//		3 + 5 = 8
//		...
//		Write a command-line program which prompts the user for an integer value and display the Fibonacci sequence leading up to that number:
//		Please enter a number: 17
//		0, 1, 1, 2, 3, 5, 8, 13
//		If the input is a number that appears in the Fibonacci sequence, print the sequence up to and including that number:
//		Please enter a number: 34
//		0, 1, 1, 2, 3, 5, 8, 13, 21, 34
//		The Fibonacci sequence always starts with 0 and 1. If the input is 0 or a negative number, print "0, 1":
//		Please enter a number: 0
//		0, 1
//		If the input is 1, print "0, 1, 1":
//		Please enter a number: 1
//		0, 1, 1




public class Fibonacci {


	public static void main(String[] args) {

		int value1 = 0;
		int value2 = 1;
		int value3;

		Scanner userInput = new Scanner(System.in);

		System.out.println("Please enter a number :");
		int numbers = userInput.nextInt();

		while(value1 < numbers) {
			System.out.print(value1 + ", ");
			value3 = value1 + value2;

			value1 = value2;
			value2 = value3;

		}

	}
}
