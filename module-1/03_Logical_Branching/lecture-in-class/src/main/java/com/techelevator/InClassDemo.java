package com.techelevator;

public class InClassDemo {

    public static void main(String[] args) {
        /*
        // print greeting
//        String greeting = "Howdy!";
//        printHello(greeting);


        // calculate
//        int one = 1;
//        int two = 2;
//       int numOne = 15;
//       int numTwo = 17;
//        System.out.println(add(one, two));
//        System.out.println(add(numOne, numTwo));
//        System.out.println(add(one, numTwo));
//        one++;
//        ++one;
//        System.out.println(add(one, two));
//        System.out.println(add(one++, two++));
        */
        bears();
    }

    public static void hello(){
        System.out.println("Hello");
    }


    public static void printHello(String message){
        message += " Hello World!!";
        System.out.println(message);
    }

    public static int add(int num1, int num2){
        int result;
        result = num1 + num2;
        return result;
    }

    public static void bears(){
        boolean isItFall = true;

        if (!isItFall) {
            System.out.println("ok Hibernation time zzzz.");
        }
        else {
            System.out.println("let's see what the humans are up to!");
        }

    }
}
