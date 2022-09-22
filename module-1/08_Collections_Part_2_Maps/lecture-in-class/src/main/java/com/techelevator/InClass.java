package com.techelevator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class InClass {

    public static void main(String[] args) {

        Map<String, String> animals = new HashMap<String, String>();

        animals.put("rhino", "Crash");
        animals.put("giraffe", "Tower");
        animals.put("elephant", "Herd");
        animals.put("lion", "Pride");
        animals.put("crow", "Murder");
        animals.put("pigeon", "Kit");
        animals.put("flamingo", "Pat");
        animals.put("deer", "Herd");
        animals.put("dog", "Pack");
        animals.put("crocodile", "Float");

        Set<String> keys = animals.keySet();


        printBreak("Keys");

        for(String key : keys){
            System.out.println(key);
        }

        printBreak("Entries");

        for (Map.Entry<String, String> entry : animals.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key: " + key + " value: " + value);

        }


        printBreak("Set");



        Set<String>  movies = new HashSet<>();
        movies.add("Thor: Love and Thunder");
        movies.add("Deadpool");
        movies.add("Good Fellas");
        movies.add("The Sting");
        movies.add("The Shining");
        movies.add("The Sting");

        //check existence
        System.out.println(movies.contains("The Sting"));
        System.out.println(movies.contains("Mobius"));

        System.out.println();
        //print the set list
        for(String movie : movies){
            System.out.println(movie);
        }

        movies.remove("The Sting");

        System.out.println();
        for(String movie : movies){
            System.out.println(movie);
        }

        printBreak("Set Size");
        System.out.println("There are " + movies.size() + " number of movies");
    }

    private static void printBreak(String heading) {
        System.out.println();
        System.out.println("--------------");
        System.out.println(" === " + heading + " ===");
        System.out.println();
    }
}
