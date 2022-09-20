package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");
		//create list
		List<String> names = new ArrayList<String>();
		names.add("Frodo");
		names.add("Sam");
		names.add("Pippins");
		names.add("Merry");
		names.add("Gandalf");
		names.add("Aragon");
		names.add("Boromic");
		names.add("Gimli");
		names.add("Legolas");


		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");

		//prints out list size
		System.out.println("List size is " + names.size());

		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));

		}

		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");

		names.add("Sam");

		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		names.add(2, "David");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}


		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

		names.remove("Sam");
		printNastyHobbitses(names);

		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");

		boolean exists = names.contains("David");
		System.out.println("David exists");

		exists = names.contains("Eric");
		if(exists) {
			System.out.println("Eric exists");
		} else {
			System.out.println("Eric doesnt exist ");
		}

		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");

		int indexOfGandalf = names.indexOf("Gandalf");
		System.out.println("Gandalf is at index " + indexOfGandalf);

		System.out.println(); // <--- spacer

		int indexOfGandalf2 = names.indexOf("gandalf");
		System.out.println("Gandalf is at index " + indexOfGandalf2);
		for (int i = 0; i < names.size() ; i++) {

			if (names.get(i).toLowerCase().equals ("gandalf")){
				System.out.println("Gandalf is at index: " + 1);
			}
		}


		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");

		String[] namesArray = names.toArray(new String[0]);
		for (int i = 0; i < namesArray.length	; i++) {
			System.out.println(namesArray[i]);
		}

		System.out.println("---- for each loop-----");
		for(String element : namesArray){
			System.out.println(element);
		}

		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");

		Collections.sort(names);
		printNastyHobbitses(names);

		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");

		//sorts in alphabetical order or smallest to largest
		Collections.reverse(names);
		printNastyHobbitses(names);

		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();




		//create list with no duplicates

		List<String> uniqueNames = new ArrayList<String>();
		uniqueNames=addUniqueNames("Frodo", uniqueNames);
		uniqueNames=addUniqueNames("Sam"), uniqueNames);
		uniqueNames=addUniqueNames("Pippins", uniqueNames));
		uniqueNames=addUniqueNames("Merry"), uniqueNames);
		uniqueNames=addUniqueNames("Gandalf"), uniqueNames);
		uniqueNames=addUniqueNames("Aragon"), uniqueNames);
		uniqueNames=addUniqueNames("Boromic"), uniqueNames);
		uniqueNames=addUniqueNames("Gimli"), uniqueNames);
		uniqueNames=addUniqueNames("Legolas"), uniqueNames);
		uniqueNames=addUniqueNames("Sam"), uniqueNames);
		uniqueNames=addUniqueNames("Sam"), uniqueNames);

	}

	public static List<String> addUniqueNames(String namestoAdd, List<String> stringList){
				if (!stringList.contains(namestoAdd));
				stringList.add(namestoAdd);
				return stringList;
	}



	public static void printNastyHobbitses(List<String> hobbitses) {
		//this for-loop is the same as the for each loop below

		for (int i = 0; i < hobbitses.size(); i++) {
			System.out.println(hobbitses.get(i));
		}


		System.out.println(); // <--- seperator. ignore this

		//for-each loop

//		for (String item : hobbitses) {
//			System.out.println(item);
		}
	}

