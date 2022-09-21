package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");


		List<String> names = new ArrayList<String>();

		names.add("Frodo");
		names.add("Sam");
		names.add("Pippin");
		names.add("Merry");
		names.add("Gandalf");
		names.add("Aragorn");
		names.add("Boromir");
		names.add("Gimli");
		names.add("Harold Legolas III");


		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");


		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");

		boolean nameAdded = false;
		for (int i = 0; i < names.size(); i++) {
			if (names.get(i) == "Sam") {
				names.add(i, "Sam");
				nameAdded = true;
				break;
			}
		}
		if (nameAdded == false) {
			names.add("Sam");
		}


		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		names.add(0, "Aragorn");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

		System.out.println("Gandalf: fly you foot!");
		names.remove("Gandalf");

		List<String> toRemove = new ArrayList<String>();
		for (String name : names) {
			if (name != "Sam") {
				toRemove.add(name);		}
			}

			System.out.println("The fellowship at 99% strength");

			System.out.println("####################");
			System.out.println("Find out if something is already in the List");
			System.out.println("####################");

			boolean containsAragorn = false;
			containsAragorn = names.contains("Aragorn");

			System.out.println("This lise contains Aragorn is: " + containsAragorn);

			System.out.println("####################");
			System.out.println("Find index of item in List");
			System.out.println("####################");


			int ganfaldPosition = names.indexOf("Gandalf");
			System.out.println("Gandalf is the " + ganfaldPosition + "th member of the fellowship");

			System.out.println("####################");
			System.out.println("Lists can be turned into an array");
			System.out.println("####################");


			String[] namesArray = names.toArray(new String[0]);
			for (int i = 0; i < names.size() ; i++) {
				System.out.println(namesArray[i]);
		}

			System.out.println("####################");
			System.out.println("Lists can be sorted");
			System.out.println("####################");

			Collections.sort(names);
			for(String name : names){
				System.out.println(name);
			}

			System.out.println("####################");
			System.out.println("Lists can be reversed too");
			System.out.println("####################");

		Collections.reverse(names);
		for(String name : names){
			System.out.println(name);
		}

			System.out.println("####################");
			System.out.println("       FOREACH");
			System.out.println("####################");
			System.out.println();

			int nameLength = 0;
			String longestName = "";

			//FOR EACH LOOP
			for(String name : names){
				if(name.length() > nameLength) {
					nameLength = name.length();
					longestName = name;
				}
			}
		System.out.println(longestName + " has the longest name at " + nameLength + " characters (for each loop)");



			//FOR LOOP
		nameLength=0;
		for (int i = 0; i < names.size() ; i++) {
			if(names.get(i).length() > nameLength) {
				nameLength = names.get(i).length();
				longestName = names.get(i);
			}
		}


		System.out.println(longestName + " has the longest name at " + nameLength + " characters (for loop)");

	}

	}


