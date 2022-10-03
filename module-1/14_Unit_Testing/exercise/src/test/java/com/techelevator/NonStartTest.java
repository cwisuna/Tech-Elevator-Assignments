package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class NonStartTest {


    NonStart concatenation = new NonStart();

    @Test
    public void getPartialStringTest(){

//        String expected = "ellohere";

        Assert.assertEquals("ellohere",concatenation.getPartialString("Hello","There"));

    }
    @Test
    public void getPartialStringTest_Null(){

        Assert.assertEquals("wo",concatenation.getPartialString("Two",""));

    }




}
