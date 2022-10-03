package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Less20Test {

    Less20 numberEntered = new Less20(); //<=== object outside scope
    @Test
    public void oneLessThanMultipleof20(){

        Assert.assertTrue(numberEntered.isLessThanMultipleOf20(38));
    }
    @Test
    public void twoLessThanMultipleof20(){

        Assert.assertFalse(numberEntered.isLessThanMultipleOf20(40));
    }

}
