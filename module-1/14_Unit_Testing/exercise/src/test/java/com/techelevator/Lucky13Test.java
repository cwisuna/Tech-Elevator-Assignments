package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Lucky13Test {

    Lucky13 containsNo1Or3s = new Lucky13();

    @Test
    public void getLuckyTest_No1sOr3s(){
        int[] numbers = {0, 2, 4};

        Assert.assertTrue(containsNo1Or3s.getLucky(numbers));


    }
    @Test
    public void getLuckyTest_Has1sOr3s() {
        int[] numbers = {1, 2, 3};

        Assert.assertFalse(containsNo1Or3s.getLucky(numbers));
    }



}
