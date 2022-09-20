package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		System.out.print("Please enter in a series of decimal values (separated by spaces): ");
		String numbersUserEnters = userInput.nextLine();

		String[] newArray = numbersUserEnters.split(" ");

		for (int i = 0; i < newArray.length ; i++) {

			int numbers = Integer.parseInt(newArray[i]);

			String s = Integer.toBinaryString(numbers);
			System.out.println(newArray[i] + " in binary is " + s);
		}

	}

}
