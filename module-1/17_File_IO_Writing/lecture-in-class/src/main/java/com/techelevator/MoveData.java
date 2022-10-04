package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MoveData {

    public static void main(String[] args) throws FileNotFoundException {
        File sourceFile = new File("src/main/resources/test.txt");
        File targetFile = new File("src", "blue.txt");

        if (!sourceFile.exists()){
            System.out.println("source file not found.");
            System.exit(1);
        }

        // get source
        try (Scanner fileScanner = new Scanner(sourceFile)){

            while(fileScanner.hasNextLine()){
                String sourceLine = fileScanner.nextLine();

                // your specialized processing here
                SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.sss");
                String stringDate = formatter.format(new Date());

                try (PrintWriter writer = new PrintWriter(new FileOutputStream(targetFile, true))){
                    writer.println( String.format("%s -- %s -- %s", stringDate ,sourceLine.substring(0,10), sourceLine.substring(0,10)));
                }

            }
        }

        // write from source to target

    }



}
