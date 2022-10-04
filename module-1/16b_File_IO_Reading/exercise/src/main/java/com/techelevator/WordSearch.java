package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {


		//alices_adventures_in_wonderland.txt

		Scanner userInput = new Scanner(System.in);   	  // scanner
		System.out.print("Enter a filesystem path: ");   // message to console/user
		String filepath = userInput.nextLine(); 		// user input store in filepath
		System.out.println("What is the search word you are looking for?");
		String word = userInput.nextLine();
		System.out.println("Should the search be case sensitive? (Y\\N)");
		String yesOrNo = userInput.nextLine();



		File bookFile = new File(filepath);		     // file object
		int lineCount = 1;							// line count

		try (Scanner openFile = new Scanner(bookFile)){  // open file
			if(bookFile.exists()){						// if file exists
				while(openFile.hasNextLine()) {		   //
					String lineOfText = openFile.nextLine();

					if (yesOrNo.contains("Y")) {

						if (lineOfText.contains(word)) {
							System.out.println(lineCount + ": " + lineOfText);


						}
					}	else {
						if (lineOfText.toLowerCase().contains(word.toLowerCase())) {
							System.out.println(lineCount + ": " + lineOfText);
						}
					}
					lineCount++;

				}

			}
		}catch (FileNotFoundException e) {
			System.out.println("file is not found");
		}


	}

}
