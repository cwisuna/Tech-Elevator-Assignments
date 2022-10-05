package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("What is the search word? ");
        String searchWord = userInput.nextLine();

        System.out.print("What is the replacement word? ");
        String replacementWord = userInput.nextLine();

        System.out.print("What is the source file? ");
        String source = userInput.nextLine();


        File sourceFile = new File(source);
        if(!sourceFile.exists()){                 //If the user enters an invalid source file, the program indicates this to the user and exits.
            System.exit(1);
        }

        System.out.print("What is the destination file? ");
        String destination = userInput.nextLine();

                // this scanner is opening/reading sourceFile               //this printWriter is printing text to destination
        try(Scanner openSourceFile = new Scanner(sourceFile); PrintWriter textToDestination = new PrintWriter(destination)){
            while(openSourceFile.hasNextLine()){                        //while loop is reading through the openSourceFile if other line exists

                String line = openSourceFile.nextLine();

                textToDestination.println(line.replace(searchWord,replacementWord));      //textToDestination is replacing text searchWord on line with replacment Word

            }

        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }


    }

}
