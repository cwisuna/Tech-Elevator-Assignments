package com.techelevator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringBitsTest{


    StringBits everyOtherChar = new StringBits(); //object outside scope
    @Test
    public void testGetBits() {
        //Arrange
        String expectedResult = "Hlo";

        //Act
        String actualResult = everyOtherChar.getBits("Hello");

        //Assert
        assertEquals(expectedResult, actualResult);

        //OR
        //assertEquals("Hlo", everyOtherChar.getBits("Hello"));
    }



}
