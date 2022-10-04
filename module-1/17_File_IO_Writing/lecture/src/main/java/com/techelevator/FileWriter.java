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
        System.out.print("Enter a message to the src/blue.txt");
        String message = userInput.nextLine();


        File targeFile = new File("src", "blue.txt");


        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String stringDate = formatter.format(new Date());

        try(PrintWriter writer = new PrintWriter(new FileOutputStream(targeFile, true))){
            writer.println(String.format("%s %s", stringDate, message));
        }



    }
}
