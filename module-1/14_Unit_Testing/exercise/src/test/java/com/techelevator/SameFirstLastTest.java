package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class SameFirstLastTest {

    SameFirstLast areTheFirstAndLastTheSame = new SameFirstLast(); // <=== object outside scope

    @Test
    public void isItTheSameTest_False(){

        int[] nums = {1, 2, 3};

        Assert.assertFalse(areTheFirstAndLastTheSame.isItTheSame(nums));

    }

    @Test
    public void isItTheSameTest_True(){

        int[] nums = {1, 2, 3, 1};

        Assert.assertTrue(areTheFirstAndLastTheSame.isItTheSame(nums));

    }

    @Test
    public void isItTheSameTest_Null(){

        boolean expectedResult = false;
        boolean actualResult = areTheFirstAndLastTheSame.isItTheSame(null);

        Assert.assertEquals(expectedResult, actualResult);

    }





}
