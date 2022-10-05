package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {


		//alices_adventures_in_wonderland.txt

		Scanner userInput = new Scanner(System.in);   	  						     // scanner

		System.out.print("Enter a filesystem path: ");     						    // message to console/user
		String filepath = userInput.nextLine(); 		  					        // user input store in filepath

		System.out.println("What is the search word you are looking for?");        // message to console/user
		String word = userInput.nextLine();									      // user input store in word

		System.out.println("Should the search be case sensitive? (Y\\N)");        // message to console/user
		String yesOrNo = userInput.nextLine();				                     // user input store in yesOrNo


		File bookFile = new File(filepath);		     		                    // file object
		int lineCount = 1;								                        // line count

		try (Scanner openFile = new Scanner(bookFile)){                        // scanner takes in bookFile and opens it
			if(bookFile.exists()){						                       // if file exists
				while(openFile.hasNextLine()) {		                          // this while loop will read the file
					String lineOfText = openFile.nextLine();                  // stores line in lineOfText

					if (yesOrNo.contains("Y")) {		                       //if user wants case sensitive

						if (lineOfText.contains(word)) {	                   //if the line contains word user specifies for

							System.out.println(lineCount + ": " + lineOfText);   // prints out lineCount and line of text
						}
					}else{

						if (lineOfText.toLowerCase().contains(word.toLowerCase())) {
							System.out.println(lineCount + ": " + lineOfText);
						}
					}
					lineCount++;						                    //increment line count

				}

			}
		}catch (FileNotFoundException e) {
			System.out.println("file is not found");
		}


	}

}
