package com.techelevator;

import org.junit.Assert;
import org.junit.Test;


    public class AnimalGroupNameTest {


    @Test
    public void ProvideKnownAnimalName_ExpectedKnownHerdName(){
        //Arrange
        AnimalGroupName animalName = new AnimalGroupName(); // <---- create local object
        //Act
//        String expectedResult = "Tower";
//        String actualResult = animalName.getHerd("giraffe");
//        //Assert
//        Assert.assertEquals(expectedResult, actualResult);
        Assert.assertEquals("Tower", animalName.getHerd("giraffe"));

    }

    @Test
    public void ProvideKnownAnimalName_WeirdCase_ExpectedKnownHerdName(){
        //Arrange
        AnimalGroupName animalName = new AnimalGroupName(); // <---- create local object
        //Act
        String expectedResult = "Tower";
        String actualResult = animalName.getHerd("gIrAfFe");
        //Assert
        Assert.assertEquals(expectedResult, actualResult);

        System.out.println(animalName);
    }

    @Test
    public void ProvideUnknownAnimalName_ExpectedUnknownHerdName(){
        //Arrange
        AnimalGroupName animalName = new AnimalGroupName(); // <---- create local object
        //Act
        String expectedResult = "unknown";
        String actualResult = animalName.getHerd("cat");
        //Assert
        Assert.assertEquals(expectedResult, actualResult);

        System.out.println(animalName);
    }

    @Test
    public void ProvideEmptyAnimalName_ExpectedUnknownHerdName(){
        //Arrange
        AnimalGroupName animalName = new AnimalGroupName(); // <---- create local object
        //Act
        String expectedResult = "unknown";
        String actualResult = animalName.getHerd("");
        //Assert
        Assert.assertEquals(expectedResult, actualResult);

        System.out.println(animalName);
    }

    @Test
    public void ProvideNullAnimalName_ExpectedUnknownHerdName(){
        //Arrange
        AnimalGroupName animalName = new AnimalGroupName(); // <---- create local object
        //Act
        String expectedResult = "unknown";
        String actualResult = animalName.getHerd("null");
        //Assert
        Assert.assertEquals(expectedResult, actualResult);

        System.out.println(animalName);
    }

}
