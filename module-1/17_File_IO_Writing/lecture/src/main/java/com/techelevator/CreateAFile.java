package com.techelevator;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateAFile {
    public static void main(String[] args) throws IOException {

        Scanner userInput = new Scanner(System.in);


        //*** create a file ***

        System.out.print("Input a directory path name: ");
        String path = userInput.nextLine();


        // ****first find the directory ****
        File newDirectory = new File(path);
        if (newDirectory.exists()) {
            System.out.print("Enter a file name with extension: ");
            String fileName = userInput.nextLine();

            File newFile = new File(newDirectory, fileName);

            if (!newFile.exists()) {
                newFile.createNewFile();

                System.out.println();
                System.out.println("name: " + newFile.getName());
                System.out.println("absolute path: " + newFile.getAbsolutePath());
                System.out.println("size: " + newFile.length());

            } else {
                System.out.println(newFile.getAbsolutePath() + " exists");
            }
        }else{
            if(newDirectory.mkdir()){
                System.out.println("New directory created at: " + newDirectory.getAbsolutePath());
            }else{
                System.out.println("Could not create new directory.");




                throw new IOException("Something horrible happened creating a directory");
            }
        }
    }
}
