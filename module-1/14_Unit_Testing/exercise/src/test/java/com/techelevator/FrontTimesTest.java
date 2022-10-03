package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class FrontTimesTest {

    FrontTimes object = new FrontTimes();

    @Test
    public void generateString_Chocolate3Times(){

        Assert.assertEquals("ChoChoCho", object.generateString("Chocolate", 3));

    }

    @Test
    public void generateString_Chocolate2Times(){

        Assert.assertEquals("ChoCho", object.generateString("Chocolate", 2));

    }





}
