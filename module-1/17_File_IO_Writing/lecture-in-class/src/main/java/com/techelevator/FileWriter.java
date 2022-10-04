package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileWriter {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a message to write to src/blue.txt : ");
        String message = userInput.nextLine();

        File targetFile = new File("src", "blue.txt");

//        try(PrintWriter writer = new PrintWriter(targetFile)){
//            writer.println(message);
//        }
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String stringDate = formatter.format(new Date());

        try (PrintWriter writer = new PrintWriter(new FileOutputStream(targetFile, true))){
            writer.println( String.format("%s %s", stringDate ,message));
        }

    }
}
