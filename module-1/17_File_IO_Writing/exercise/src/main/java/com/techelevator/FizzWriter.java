package com.techelevator;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) {



		Scanner userInput = new Scanner(System.in);

		System.out.println("Enter a destination file: ");
		String destination = userInput.nextLine();


		try(PrintWriter writer = new PrintWriter(destination)){

			for (int i = 1; i <= 300 ; i++) {
				if(i % 5 == 0 && i % 3== 0){
					writer.println("FizzBuzz");
				} else if (i % 3 == 0){
					writer.println("Fizz");
				} else if (i % 5 == 0) {
					writer.println("Buzz");
				} else{
					writer.println(i);
				}
			}


		} catch (FileNotFoundException e) {
			System.out.println("File not found");;
		}










	}

}
