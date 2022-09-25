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



		
		System.out.println();
		System.out.println("******************************");
		System.out.println("****** MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();


		String name = "JarJar Binks";
		char first = name.charAt(0);
		char fourth = name.charAt(3);
		System.out.println(first);
		System.out.println(fourth);


		System.out.println("+++++++++++++++++CONTAINS+++++++++++++++");
		String hello = "Hello, World";
		boolean hasHello = hello.contains("Hello");
		System.out.println("hasHello = " + hasHello);
		boolean hasBogus = hello.contains("Bogus");
		System.out.println("hasBogus = " + hasBogus);




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

		String lectureString = "It was the best of times, it was the worst of times... ";
		String chrisString = lectureString.toLowerCase();
		boolean containsWorst = chrisString.contains("worst");
		System.out.println(containsWorst);

		System.out.println();
		System.out.println("====================================");

		String favoriteStarWarsCharacter = "Boba Fett, Darth Vader, Anakin Skywalker, Padme, Leia, Obi-Wan";
		int fIsAt = 0;
		fIsAt = favoriteStarWarsCharacter.indexOf('F');
		System.out.println(fIsAt);

		String characterFirstName;
		int spaceCharacter = favoriteStarWarsCharacter.indexOf(' ');
		characterFirstName = favoriteStarWarsCharacter.substring(0, spaceCharacter);
		System.out.println(characterFirstName);

		String[] nameElements  = favoriteStarWarsCharacter.split(", ");
		for (int i = 0; i < nameElements.length ; i++) {
			System.out.println(nameElements[i]);
		}
		}



	}

