package com.techelevator;

public class Lecture {

	public static void main(String[] args) {

//			System.out.println("Hello, World!");
//
//			System.out.println("Hello again!");
//
//			int j;
//			j =3;
//			float i = 10.01f;
//			boolean y = false;
//
//			System.out.println("j = " + j);
//			System.out.println("I = " + i);
//
//			final double PI_DEF = 3.14d;
//			System.out.printf("PI = " + PI_DEF);

//		String myString = "My \t String \n Data.";
//		System.out.println(myString);

//		int i = 5;
//		i = i + 6;
//		System.out.println("i = i + 6;" +i);
//		i -= 7;

//		byte myByte = 4;
//		byte myOtherByte = 4;
//
//		byte firstAttempt = (byte) (myByte + myOtherByte);
//		int secondAttempt = myByte + myOtherByte;
//		System.out.printf("firstAttempt:" + firstAttempt);
//		System.out.printf("secondAttempt:" + secondAttempt);

		/*
		1. Create a variable to hold an int and call it numberOfExercises.
			Then set it to 26.
		*/
		int numberOfExercises = 26;
		System.out.println(numberOfExercises);

		/*
		2. Create a variable to hold a double and call it half.
			Set it to 0.5.
		*/
		double half = 0.5d;
		System.out.println(half);

		/*
		3. Create a variable to hold a String and call it name.
			Set it to "TechElevator".
		*/
		String name = "Tech Elevator";
		System.out.println(name);

		/*
		4. Create a variable called seasonsOfFirefly and set it to 1.
		*/
		int seasonsOfFirefly = 1;
		System.out.println(seasonsOfFirefly);

		/*
		5. Create a variable called myFavoriteLanguage and set it to "Java".
		*/
		String myFavoriteLanguage = "Java";
		System.out.println(myFavoriteLanguage);

		/*
		6. Create a variable called pi and set it to 3.1416.
		*/
		double pi = 3.1416;
		System.out.println(pi);

		/*
		7. Create and set a variable that holds your name.
		*/
		String myName = "Chris";
		System.out.println(myName);
		/*
		8. Create and set a variable that holds the number of buttons on your mouse.
		*/
		int numberOFMouseButtons = 3;
		System.out.println(numberOFMouseButtons);
		/*
		9. Create and set a variable that holds the percentage of battery left on
		your phone.
		*/
		double percentageOfPhoneBatteryLeft = 0.7533;
		int batteryLifePercentage = 75;
		String lifeLeft = (String) (batteryLifePercentage + "%");
		System.out.println(lifeLeft);
		/*
		10. Create an int variable that holds the difference between 121 and 27.
		*/
		int value1 = 121;
		int value2 = 27;

		int subtractionDifference = value1 - value2;
		System.out.println(subtractionDifference);

		/*
		11. Create a double that holds the addition of 12.3 and 32.1.
		*/
		float additionResults = 12.3f + 32.1f;
		System.out.println(additionResults);
		/*
		12. Create a String that holds your full name.
		*/
		String myFullName = "Christopher Luna";
		System.out.println(myFullName);
		/*
		13. Create a String that holds the word "Hello, " concatenated onto your
		name from above.
		*/
		String sentence = "Hello, " + myFullName;
		System.out.println(sentence);

		/*
		14. Add a " Esquire" onto the end of your full name and save it back to
		the same variable.
		*/

		/*
		15. Now do the same as exercise 14, but use the += operator.
		*/
		myFullName += " Esquire";
		System.out.println(myFullName);
		/*
		16. Create a variable to hold "Saw" and add a 2 onto the end of it.
		*/
		String movie = "Saw " + 2;
		System.out.println(movie);

		/*
		17. Add a 0 onto the end of the variable from exercise 16.
		*/
		movie += 0;
		System.out.println(movie);
		/*
		18. What is 4.4 divided by 2.2?
		*/
		double divisionResult = 4.4 / 2.2;
		System.out.println(divisionResult);
		/*
		19. What is 5.4 divided by 2?
		*/
		double moreDivision = 5.4 / 2;
		System.out.println(moreDivision);
		/*
		20. What is 5 divided by 2?
		*/
		int evenMoreDivision1 = 5 / 2;
		double evenMoreDivision2 = 5 / 2;
		System.out.println(evenMoreDivision1 + ", " + evenMoreDivision2);
		/*
		21. What is 5.0 divided by 2?
		*/

		/*
		22. What is 66.6 divided by 100? Is the answer you get right or wrong?
		*/
		double result666 = 66.6 / 100;
		System.out.println(result666);
		/*
		23. If I divide 5 by 2, what's my remainder?
		*/
		int modulusRemainder = 5 % 2;
		System.out.println(modulusRemainder);
		/*
		24. What is 1,000,000,000 * 3?
		*/
		int billion = 1000000000;
		long threeBillion = billion * 3L;
		System.out.println(billion + ", " + threeBillion);
		/*
		25. Create a variable that holds a boolean called isDoneWithExercises and
		set it to false.
		*/
		boolean	isDoneWithExercises = false;
		System.out.println(isDoneWithExercises);
		/*
		26. Now set isDoneWithExercise to true.
		*/
		isDoneWithExercises = true;
		System.out.println(isDoneWithExercises);
	}

}
