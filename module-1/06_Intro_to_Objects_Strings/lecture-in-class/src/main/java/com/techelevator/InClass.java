package com.techelevator;

import java.math.BigDecimal;

public class InClass {

    public static void main(String[] args) {

        String myString = "Pure Michigan";
        myString = myString.substring(0, 6);
        System.out.println(myString);
       // System.out.println(mySubString);

        String myString1 = "Hello World";
        String myString2 = "Hello World";

        if (myString1 == myString2) {
            System.out.println("match");
        } else {
            System.out.println("No match");
        }
        bigDecimalExample();

    }

    public static void bigDecimalExample(){
        double a = 0.02;
        double b = 0.03;
        double c = b - a;
        System.out.println(c);

        BigDecimal _a = new BigDecimal("0.02");
        BigDecimal _b = BigDecimal.valueOf(0.03);
        BigDecimal _c = _b.subtract(_a);
        System.out.println(_c);


        BigDecimal anotherNumber = BigDecimal.valueOf(4.0);
        System.out.println(_a.add(anotherNumber));

    }


}
