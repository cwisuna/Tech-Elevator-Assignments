package com.techelevator;

public class InClassDemo {
    public static void main(String[] args) {
        String hello = "Hello World";
        greeting(hello);

        int num1 = 1;
        int num2 = 2;
        int result = add(num1, num2);
        System.out.println(result);
    }
    public static void greeting(String message){
        System.out.println(message);
    }

    public static int add(int num1, int num2) {
//        int result = 0;
//        result = num1 + num2;
        return num1 + num2;
    }
}
