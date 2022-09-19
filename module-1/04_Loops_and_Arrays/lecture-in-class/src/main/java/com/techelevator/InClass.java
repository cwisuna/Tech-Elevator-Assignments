package com.techelevator;

public class InClass {

    public static void main(String[] args) {
//        int x = 7;
//
//        for(int bob = 0; bob  < 5 ; bob++){
//
//            x = 4 + bob;
//            System.out.println( bob + ": Developers! " + x);
//        }
//
//        int bob = 7;
//        while (bob < 5 ){
//            x++;
//            System.out.println(bob  +" in the Bob loop " + x);
//            bob++;
//        }
//
//        int larry = 7;
//        do {
//            x++;
//            System.out.println(larry  +" in the larry loop " + x);
//            larry++;
//        } while (larry < 5);
//
//
//        System.out.println(x);
//
//        for (int i = 0; i < 3; i++){
//            System.out.print(i + "\n");
//        }
//
//        System.out.println("The final Bob: " + bob);


        int[] arrayToLoopThrough = { 4, 3, 4, 1, 4, 6 };

        int sum = 0;

        //     Start;       Keep going while       Increment by;
        for (int i = 0; i < arrayToLoopThrough.length; i += 2){

            System.out.print(i + " ==> ");
            System.out.println(arrayToLoopThrough[i] + "  --  " + arrayToLoopThrough[i + 1]);

        }

    }
}
