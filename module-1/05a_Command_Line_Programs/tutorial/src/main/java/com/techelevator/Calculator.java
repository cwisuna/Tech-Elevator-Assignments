package com.techelevator;

public class Calculator {
    static boolean isEven(int a) {
        int remainder = a % 2;
        // integer ^

        // if integer (remainder) is equal to zero then true otherwise no.
        if(remainder == 0) {
            return true;
        } else {
            return false;
        }
    }

}
