package com.techelevator.exceptions;

import java.util.Scanner;

public class ExceptionInClass{
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);

    System.out.println("The following cities: ");
    String[] cities = new String[] { "Cleveland", "Columbus", "Cincinnati" };

    try {

//        int result = 6/0;
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);  // This statement will throw an ArrayIndexOutOfBoundsException
     //   System.out.println("are all in Ohio."); // This line won't execute because the previous statement throws an Exception
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Index out of bounds. Something went terribly wrong.");
    } catch( ArithmeticException e){
        System.out.println("Arithmetic  error" + e.getMessage());
    }  finally {
        System.out.println("are all in Ohio.");
    }

		System.out.println();

    /* try/catch blocks will also catch Exceptions that are thrown from method calls further down the stack */

        try {
            System.out.println("Hey ya'll, watch this!");
            doSomethingDangerous();  // throws an ArrayIndexOutOfBoundsException
            System.out.println("See, I told you nothing would go wrong!");

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Darwin award winner" + e.getMessage());
        } catch (Exception e)  {
            System.out.println("Darwin award winner" + e.getMessage());
    }
		System.out.println();

    /* catch statements can take advantage of polymorphism. The catch block will handle any Exception that
     * matches the declared Exception type, including subclasses of the declared type */
        int overtimeHours = 0;
        try {

            System.out.println("The standard work week is 40 hours.");
            System.out.print("How many hours did you work this week? >>> ");

           // int hoursWorked = Integer.valueOf(scan.nextLine());


            String numString = scan.nextLine();
            int hoursWorked = Integer.valueOf(numString);

            if (hoursWorked <= 40){
                throw new Exception("You tried cheat to us!  No one gets overtime without working over forty hours");
            }

            if (hoursWorked > 40) {
                overtimeHours = hoursWorked - 40;
            }
            //System.out.println("You worked " + overtimeHours + " hours of overtime.");
        } catch (Exception e){
            System.out.println("You did it wrong;" + e.getMessage());
        } finally {
            System.out.println("You worked " + overtimeHours + " hours of overtime.");
        }


		System.out.println();

    /* we can throw our own Exceptions in response to exceptional cases
     * see the source code of calculateHotelRoomCharges for an example */
    int nights = -3;
    int numberOfGuests = 2;
    try {
        double amountOwed = calculateHotelRoomCharges(nights, numberOfGuests);
        System.out.println("Total owed for " + numberOfGuests + " guests for " + nights + " nights is $" + amountOwed);
    } catch (IllegalArgumentException e){
        System.out.println(numberOfGuests + " guests for " + nights + " night is invalid.");
        System.out.println(e.getMessage());
    }
		System.out.println();


    /* The withdraw method can throw a checked exception (i.e. OverdraftException) so we need to catch it since
     * the main method does not declare that it throws any exceptions. */
    double currentBalance = 250;
    double amountToWithdraw = 300;

    try {
        double newBalance = withdraw(currentBalance, amountToWithdraw);
        System.out.println("new balance is " + newBalance);
    } catch  (OverdraftException e){
        System.out.println("Your overdrafted: " + e.getOverdraftAmount());
        System.out.println(e.getMessage());
       // System.out.println(e.getStackTrace());
        e.printStackTrace();
    }
		System.out.println();

    /* if we try to call the withdraw method outside of a try/catch, it will cause a compiler error */
    //withdraw(currentBalance, amountToWithdraw);


    /* every Exception contains a "stacktrace" that can be extremely useful in debugging.
     * The stacktrace contains a record of where the Exception was thrown and all of the
     * method calls that lead up to the Exception being thrown. */

        //doSomethingDangerous(); // throws an ArrayIndexOutOfBoundsException

		System.out.println();
}

    /* this method does not need to declare that it throws an IllegalArgumentException because
     * it is a subclass of RuntimeException.  These are known as "unchecked exceptions" because
     * the compiler does not force us to catch them. */
    private static double calculateHotelRoomCharges(int nights, int numberOfGuests) {
        final double EXTRA_GUEST_CHARGE = 20;
        final double ROOM_RATE = 85;

        /* The throw statements below demonstrate how to throw a new Exception. */
        if(nights < 1) {
            throw new IllegalArgumentException("Minimum number of nights is 1");
        } else if(numberOfGuests < 1) {
            throw new IllegalArgumentException("Minimum number of guests is 1");
        }

        int numberOfExtraGuests = 0;
        if(numberOfGuests > 4) {
            numberOfExtraGuests = numberOfGuests - 4;
        }

        double dailyRate = ROOM_RATE + (EXTRA_GUEST_CHARGE * numberOfExtraGuests);
        return dailyRate * nights;
    }

    /* OverdraftException is a "checked exception" (i.e. it is a subclass of java.lang.Exception)
     * so we need to either catch it or declare that it is thrown.  This method declares that
     * it can throw an OverdraftException using the "throws" keyword */
    public static double withdraw(double currentBalance, double amountToWithdraw) throws OverdraftException {
        double newBalance = 0;
        if(amountToWithdraw <= currentBalance) {
            newBalance = currentBalance - amountToWithdraw;
        }
        else {
            throw new OverdraftException("The requested withdrawal amount is greater than the current balance", Math.abs(currentBalance - amountToWithdraw));
        }
        return newBalance;
    }

    private static void doSomethingDangerous() {
        int[] numbers = new int[5];
        for(int i = 0; i < 10; i++) {
            numbers[i] = i;  // this line will throw an Exception once i reaches 5
        }
        System.out.println("Look Ma, no Exceptions!");  // This line will not execute because an Exception will be thrown inside the for loop
    }
}
