package com.techelevator;

import org.junit.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class InClassTest {
 private Example example;

   @Before
   public void setup() {
       example = new Example();
   }

   @After
    public void teardown(){

   }

   @Test
    public void isEven_withEvenValue_shouldReturnTrue(){
       // Arrange
       boolean expectedValue = true;
       int inputValue = 2;
       // Act
       boolean result = example.isEven(inputValue);
       // Assert
       Assert.assertEquals(expectedValue, result);
       System.out.println(inputValue + " is binary value of " + helpMethod(inputValue));

   }


   @Test
    public void isEven_withOddValue_shouldReturnFalse(){
       // Assert
       boolean expectedValue = false;
       int inputValue = 3;
       // Act
       boolean result = example.isEven(inputValue);
       // Assert
       Assert.assertEquals(expectedValue, result);
   }

   private String helpMethod(int inputValue){
       return Integer.toBinaryString(inputValue);
   }
}
