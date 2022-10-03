package com.techelevator;
import org.junit.Assert;
import org.junit.Test;

public class MaxEnd3Test {


    MaxEnd3 firstVsLastLargest = new MaxEnd3();

    @Test
    public void testMakeArray(){
        //Arrange

        int[] nums = new int[] {11, 5, 9}; //<---- made sample array

        //Act
        int[] expectedArray = new int[] {11,11,11}; //<--- what i wanted
        int[] actualArray = firstVsLastLargest.makeArray(nums);

        //Assert
        Assert.assertArrayEquals(expectedArray,actualArray);


    }



}
