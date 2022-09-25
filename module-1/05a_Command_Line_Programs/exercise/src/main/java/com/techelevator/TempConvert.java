package com.techelevator;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class TempConvert {
//	The Fahrenheit to Celsius conversion formula is:
//	temperatureCelsius = (temperatureFarenheit - 32) / 1.8


//	The Celsius to Fahrenheit conversion formula is:
//  temperatureFarenheit = temperatureCelsius * 1.8 + 32
//
//
//	Write a command-line program which prompts a user to enter a temperature, and whether it's in degrees (C)elsius or (F)ahrenheit. Convert the temperature to the opposite degrees, and display the old and new temperatures to the console.
//
//	Please enter the temperature: 58
//	Is the temperature in (C)elsius, or (F)ahrenheit? F
//	58F is 14C.


	public static void main(String[] args) {
		Scanner tempConvert	= new Scanner(System.in);

		System.out.println("Please enter the temperature: ");
		int userInput = tempConvert.nextInt();

		System.out.println("Is the temperature in (C)elsius, or (F)ahrenheit? ");
		String celandFahr = tempConvert.nextLine();

		if(celandFahr.equals("F")) {
			System.out.println(userInput + "F" + " is " + (userInput - 32) / 1.8 + "C" );
		}
		if(celandFahr.equals("C")) {
			System.out.println(userInput + "C" + " is " + ((userInput * 1.8)+32) + "F" );
		}

		}

}
