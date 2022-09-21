package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();



		Map<Integer,String> myMap = new HashMap<>();


		myMap.put(2,"Beth");
		myMap.put(5,"Shane");
		myMap.put(3,"Carol");
		myMap.put(6,"Daryl");
		myMap.put(1,"Rick");
		myMap.put(2,"Merle");
		myMap.put(4,"Ben");

		System.out.println(myMap.get(2));


		// existence check -> contatinsKey
		int searchByKey = 4;
		if (myMap.containsKey(searchByKey)){
			String name = myMap.get(searchByKey);
			System.out.println(name.substring(0,3));
		} else {
			System.out.println("Key : " + searchByKey + " not found");
		}

		//print the size
		System.out.println("myMap contains " + myMap.size() + " items.");

		System.out.println();
		System.out.println("=================");
		System.out.println();
		//get the key set
		Set<Integer> keys = myMap.keySet();

		for(Integer key : keys){
			System.out.println(key);
		}
		System.out.println();
		System.out.println("=================");
		System.out.println();

		//get the values

//		myMap.put(1,"Rick");
//		myMap.put(2,"Merle");
//		myMap.put(3,"Carol");
//		myMap.put(4,"Ben");
//		myMap.put(5,"Shane");
//		myMap.put(6,"Daryl");
//
//		[ {1,"Rick"} ,{2, "Merle"}, {3, "Carol"}...  ]

		for (Map.Entry<Integer, String> entry : myMap.entrySet()){
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key: " + key + " value: " + value);

		}

		System.out.println();
		System.out.println("=================");
		System.out.println();
		// remove an item by key

		myMap.remove(2);
		System.out.println(myMap.get(2));


		for (Map.Entry<Integer, String> entry : myMap.entrySet()){
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key: " + key + " value: " + value);

		}

		System.out.println();
		System.out.println("=================");
		System.out.println();


		myMap.put(null,"Neegan");
		myMap.put(null,"Bob");
		for (Map.Entry<Integer, String> entry : myMap.entrySet()){
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key: " + key + " value: " + value);

		}

		System.out.println(myMap.get(null));

	}

}
