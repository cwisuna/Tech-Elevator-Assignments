package com.techelevator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lecture {

	public static void main(String[] args) {

		//map labeled
		// 1, "Rick"
		// key, value

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();

		Map<Integer, String> myMap = new HashMap<>();

		myMap.put(3, "Carol");
		myMap.put(2, "Beth");
		myMap.put(4, "Ben");   //<----- values in myMap
		myMap.put(1, "Rick");
		myMap.put(6, "Daryl");
		myMap.put(5, "Shane");


		myMap.put(2, "Merle"); //<---  overwrites key 2 with value meryl


		int searchByKey = 3;
		if(myMap.containsKey(searchByKey)) {
			String name = myMap.get(searchByKey);
			System.out.println(name.substring(0,3));
		} else {
			System.out.println("Key : 3 not found");
		}

		System.out.println("####################");


		System.out.println(myMap.get(2)); // <---- samething as thing listed below
		System.out.println("####################");
		String name = myMap.get(2);
		System.out.println(name);


		System.out.println("My map contains " + myMap.size() +" items"); //< -- prints out size of map

		System.out.println("####################");


		Set<Integer> keys = myMap.keySet();
		for(Integer key : keys){						//<---get maps keys using keySet method
			System.out.println(key);
		}

		System.out.println("####################");

//		myMap.put(1, "Rick");
//		myMap.put(2, "Beth");
//		myMap.put(3, "Carol");
//		myMap.put(4, "Ben");
//		myMap.put(5, "Shane");
//		myMap.put(6, "Daryl");

		for(Map.Entry<Integer, String> entry : myMap.entrySet() ){
			Integer key = entry.getKey();				// <------ gets  maps entries (key, value)
			String value = entry.getValue();

			System.out.println("Key: " + key + " value: " + value);
		}


		System.out.println("####################");

		myMap.remove(2);   				 // <---- remove item by key

		System.out.println(myMap.get(2));  // <--- returns null bc key 2 is no longer there

		for(Map.Entry<Integer, String> entry : myMap.entrySet() ){
			Integer key = entry.getKey();
			String value = entry.getValue();

			System.out.println("Key: " + key + " value: " + value);

			System.out.println();
			System.out.println("####################");


			Set<String> movies = new HashSet<>(); // <----- declaring set

			movies.add("Thor: Love and Thunder");
			movies.add("Deadpool");
			movies.add("Good Fellas");
			movies.add("The Sting");
			movies.add("The Shining");
			movies.add("The Sting");


		}

	}

}
