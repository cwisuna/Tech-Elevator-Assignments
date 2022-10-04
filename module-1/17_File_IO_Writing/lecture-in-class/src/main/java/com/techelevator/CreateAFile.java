package com.techelevator;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateAFile {

    public static void main(String[] args) throws IOException {
        Scanner userInput = new Scanner(System.in);

        //*** Create a file  ****

        // first find the directory
        System.out.print("Input a directory path name: ");
        String path = userInput.nextLine();

        File newDirectory = new File(path);
        if (newDirectory.exists()){

           File betterFile =  createNewFile(userInput, newDirectory);


        } else {
            if (newDirectory.mkdir()){
                System.out.println("New directory created: " + newDirectory.getAbsolutePath());
                File f = createNewFile(userInput, newDirectory);


            } else {
                System.out.println("Could not create directory.");
                throw new IOException("Something horrible happened creating a directory.");
            }
        }
    }

    private static File createNewFile(Scanner userInput, File newDirectory) throws IOException {
        System.out.print("Enter a file name with extension: ");
        String fileName = userInput.nextLine();

        File newFile = new File(newDirectory, fileName);

        if (!newFile.exists()) {
            newFile.createNewFile();

            System.out.println();
            System.out.println("name: " + newFile.getName());
            System.out.println("absolutePath: " + newFile.getAbsolutePath());
            System.out.println("size: " + newFile.length());
        } else {
            System.out.println(newFile.getAbsolutePath() + " exists.");
        }

        return newFile;
    }


}
