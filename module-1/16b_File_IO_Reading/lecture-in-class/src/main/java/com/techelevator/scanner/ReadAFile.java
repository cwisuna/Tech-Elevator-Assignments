package com.techelevator.scanner;

import com.techelevator.model.Colors;
import com.techelevator.model.Product;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ReadAFile {


    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = getInputFile("src/main/resources/test.txt");
//
//        int lineNumber = 1;
//        try (Scanner fileScanner = new Scanner(inputFile)){
//            while (fileScanner.hasNextLine()){
//                String line = fileScanner.nextLine();
//
//                String[] words = line.split(" ");
//                System.out.print(lineNumber + " ");
//                for (int i = words.length - 1; i >= 0.; i--) {
//                    System.out.print(words[i] + " ");
//                }
//                System.out.println();
//              //  System.out.println(lineNumber + " " + line);
//                lineNumber++;
//            }
//        }


//        inputFile = getInputFile("src/main/resources/productList.txt");
//
//        List<Product>  productList = new ArrayList<>();
//        try (Scanner fileScanner = new Scanner(inputFile)) {
//            while (fileScanner.hasNextLine()) {
//                String line = fileScanner.nextLine();
//
//
//                String productNumber = line.substring(0, 9);
//                String productColor = line.substring(9,13).trim();
//                String product = line.substring(13,23).trim();
//                double productPrice = Integer.valueOf(line.substring(23,27)) / 100;
//
//                //Product newProduct = new Product(productNumber,productColor, product, productPrice);
//
//                productList.add( new Product(productNumber,productColor, product, productPrice));
//            }
//        }
//
//        for(Product item : productList){
//            System.out.println(item.toString());
//        }


        Colors color = Colors.RED;
        if (Colors.RED.compareTo( Colors.BLUE) > 0){

        }
        System.out.println();

    }

    private static File getInputFile(String path) {
       // String path = "src/main/resources/test.txt" ;
        File inputFile = new File(path);

        if (!inputFile.exists()){
            System.out.println(path + " does not exist");
            System.exit(1);
        } else if(inputFile.isDirectory()){
            System.out.println(path + " is not a file");
            System.exit(2);
        }

        return inputFile;
    }
}
