package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		System.out.println("Please enter the length: ");
		String lengthUserEntered = userInput.nextLine();

		System.out.println("Is the measurement in (m)eter, or (f)eet?");
		String metersOrFeet = userInput.nextLine();

		if (metersOrFeet.equals("f")) {
			double feet = Double.parseDouble(lengthUserEntered);
			System.out.println(lengthUserEntered + "f is " + (feet * 0.3048) + " m.");
		}
		if (metersOrFeet.equals("m")) {
			double meters = Double.parseDouble(lengthUserEntered);
			System.out.println(lengthUserEntered + "m is " + (meters * 3.2808399) + " F.");

		}
	}
}
