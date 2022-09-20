package com.techelevator;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");
		List<String> names = new ArrayList<>();
		names.add("Frodo");
		names.add("Sam");
		names.add("Pippins");
		names.add("Merry");
		names.add("Gandalf");
		names.add("Aragorn");
		names.add("Boromir");
		names.add("Gimli");
		names.add("Legolas");

		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");

		System.out.println("List size is  " + names.size());

		printNastyHobbitses(names);

		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");

		names.add("Sam");

		printNastyHobbitses(names);

		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");


		names.add(2, "David");
		printNastyHobbitses(names);

		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

		//names.remove("Sam");

		while(names.contains("Sam")){
			names.remove("Sam");
		}
		printNastyHobbitses(names);

		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");

		boolean exists  = names.contains("David");
		System.out.println("David exists");

		exists  = names.contains("Sam");
		String existenceResult = exists ? "Sam exists": "Sam does not exist";
//		if (names.contains("Sam") ) {
//			System.out.println("Sam exists");
//		} else {
//			System.out.println("Sam does not exist.");
//		}
		System.out.println(existenceResult);


		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");

		int indexOfGandalf = names.indexOf("gandalf");
		System.out.println("Gandalf is at index " + indexOfGandalf);

		for (int i = 0; i < names.size(); i++) {

			if (names.get(i).toLowerCase().equals("gandalf")){
				System.out.println("Gandalf is at index : " + i);
			}
		}

		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");

		String[] namesArray = names.toArray(new String[0]);

		for (int i = 0; i < namesArray.length; i++) {
			System.out.println(namesArray[i]);
		}

		 System.out.println("  ----  for each loop ----");

		for(String element : namesArray){
			System.out.println(element);
		}

		System.out.println();
		System.out.println("--------------------");
		System.out.println();

		names.add(1,"Sam");
		names.add(3,"Sam");
		names.add(5,"Sam");
		names.add(7,"Sam");


		String nameToFind = "Sam";
		int index = 0;
		for(String item: names){
			if (item.equals(nameToFind)){
				System.out.println("Sam is at index: " + index);

			}
			index++;
		}

		for (int i = 0; i < names.size(); i++) {
			if (names.get(i).equals(nameToFind)){
				System.out.println("Sam is at index: " + i);
			}
		}
		printNastyHobbitses(names);



		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");

		Collections.sort(names);
		printNastyHobbitses(names);


		List<Integer> integerList = new ArrayList<>();
		for (int i = 100; i > 0; i--) {

			integerList.add(i);

		}

		Collections.sort(integerList);
		for(Integer i : integerList){
			System.out.println(i);
		}

		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");

		Collections.reverse(names);
		printNastyHobbitses(names);

		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();



		// Create a list with no duplicates
		System.out.println("####################");
		System.out.println("        Create a list with no duplicates");
		System.out.println("####################");
		System.out.println();
		List<String> uniqueNnames = new ArrayList<>();
		uniqueNnames = AddUniqueNames("Frodo",uniqueNnames);
		uniqueNnames = AddUniqueNames("Sam",uniqueNnames);
		uniqueNnames = AddUniqueNames("Pippins",uniqueNnames);
		uniqueNnames = AddUniqueNames("Merry",uniqueNnames);
		uniqueNnames = AddUniqueNames("Gandalf",uniqueNnames);
		uniqueNnames = AddUniqueNames("Aragorn",uniqueNnames);
		uniqueNnames = AddUniqueNames("Boromir",uniqueNnames);
		uniqueNnames = AddUniqueNames("Gimli",uniqueNnames);
		uniqueNnames = AddUniqueNames("Legolas",uniqueNnames);
		uniqueNnames = AddUniqueNames("Sam",uniqueNnames);
		uniqueNnames = AddUniqueNames("Sam",uniqueNnames);


		System.out.println("-----------------------------");
		printNastyHobbitses(uniqueNnames);


		System.out.println("####################");
		System.out.println("        AutoBoxing");
		System.out.println("####################");
		System.out.println();

	//	Autoboxing();
		System.out.println("####################");
		System.out.println("        Unboxing");
		System.out.println("####################");
		System.out.println();
	//	Unboxing();
	}

	public static List<String> AddUniqueNames(String nameToAdd, List<String> stringList){

		 if(!stringList.contains(nameToAdd)){
			 stringList.add(nameToAdd);
		 }

		return stringList;

	}
	public static void printNastyHobbitses(List<String> hobbitses){

		for(String item: hobbitses){
			System.out.println(item);
		}
	}


	public static void Autoboxing(){


		List<Integer> intList1 = new ArrayList<>();
		for (int i = 1; i < 50; i++) {
			intList1.add(i);
		}

		List<Integer> intList2 = new ArrayList<>();
		for (int i = 1; i < 50; i++) {
			intList2.add(Integer.valueOf(i));
		}


		for(Integer item: intList1){
			System.out.println(item);
		}

		for(Integer item: intList2){
			System.out.println(item);
		}


	}


	public static void  Unboxing() {


			Integer i = new Integer(-8);

			// 1. Unboxing through method invocation
			int absVal = absoluteValue(i);
			System.out.println("absolute value of " + i + " = " + absVal);

			List<Double> ld = new ArrayList<>();
			ld.add(3.1416);    // # is autoboxed through method invocation.

			// 2. Unboxing through assignment
			double pi = ld.get(0);
			System.out.println("pi = " + pi);
		}

		public static int absoluteValue(int i) {
			return (i < 0) ? -i : i;
		}
	}


