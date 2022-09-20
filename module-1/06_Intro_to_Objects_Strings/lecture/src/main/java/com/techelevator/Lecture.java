package com.techelevator;

import java.sql.SQLOutput;
import java.util.Locale;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("************************************");
		System.out.println("****** MAKING A STRING OBJECT ******");
		System.out.println("************************************");

		/* The String class gets special treatment in the Java language.  One
		 * example of this is that there is a literal representation of a
		 * String (i.e. characters appearing between two double quotes.  This
		 * is not the case for most classes */

		/* create an new instance of String using a literal */
		String greeting = "Hello World"; // <=== literal
		System.out.println("greeting " + greeting );

		
		System.out.println();
		System.out.println("******************************");
		System.out.println("****** MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();

		System.out.println("charAt()");

		String name = "Obama";
		char firstCharacter = name.charAt(0);
		char fourthCharacter = name.charAt(3);


		System.out.println("First character of " + name + " = " + firstCharacter);
		System.out.println("Fourth character of " + name + " = " + fourthCharacter);
		System.out.println(name);


		System.out.println();
		System.out.println("contains()");
		String helloWorld = "Hello World!!";


		String hello = "hELlo";
		boolean result = helloWorld.toLowerCase().contains(hello.toLowerCase());
		System.out.println("comparison result = " + result);

		String UpperCaseHelloWorld = helloWorld.toLowerCase();
		String LowerCaseHelloWorld = helloWorld.toLowerCase();

		String LowerCaseHello =  hello.toLowerCase();

		boolean helloComparison = LowerCaseHello.contains(LowerCaseHello);

		System.out.println("Compare lower case hello: " + helloComparison);
//		System.out.println(UpperCaseHelloWorld);
//		System.out.println(LowerCaseHelloWorld);

		boolean containsHello = helloWorld.contains(hello);
		System.out.println("Hello World contains hello: " + containsHello);
		String bogus = "bogus";
		System.out.println("Hello World contains Bogus: " + helloWorld.contains(bogus));

		System.out.println();
		System.out.println("endsWith: " + helloWorld.endsWith("!"));
		System.out.println("endsWith !d: " + helloWorld.endsWith("d!"));
		System.out.println("endsWith: bob: " +  helloWorld.endsWith("bob"));




		String tattle = "tattle";
		System.out.println("=======================");
		System.out.println(tattle.substring(1,4));
		System.out.println(tattle.substring(2));



		String techElevator = "  Tech Elevator  Java Blue  ";
		int startingPosition = techElevator.trim().toLowerCase().indexOf("java");

		String myClass = techElevator.substring(startingPosition);
		System.out.println(myClass);





		/* Other commonly used methods:
		 *
		 * endsWith
		 * startsWith
		 * indexOf
		 * lastIndexOf
		 * length
		 * substring
		 * toLowerCase
		 * toUpperCase
		 * trim
		 */

		System.out.println();
		System.out.println("**********************");
		System.out.println("****** EQUALITY ******");
		System.out.println("**********************");
		System.out.println();

        char[] helloArray = new char[] { 'H', 'e', 'l', 'l', 'o' };
        String hello1 = new String(helloArray);
        String hello2 = new String(helloArray);

		/* Double equals will compare to see if the two variables, hello1 and
		 * hello2 point to the same object in memory. Are they the same object? */
		if (hello1 == hello2) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

		String hello3 = hello1;
		if (hello1 == hello3) {
			System.out.println("hello1 is the same reference as hello3");
		}

		/* So, to compare the values of two objects, we need to use the equals method.
		 * Every object type has an equals method */
		if (hello1.equals(hello2)) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

	}
}
