package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class DateFashionTest {


    @Test
    public void testDateFashion_GetTable(){
        //Arrange
        DateFashion youAndDate = new DateFashion(); // local object

        //Act
//        int table = youAndDate.getATable(5,10); //create table
        int expectedResult = 2;
        int actualResult = youAndDate.getATable(5, 10);

        //Assert
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testDateFashion_DontGetTable(){

        DateFashion youAndDate = new DateFashion();//local object


        int table = youAndDate.getATable(1,10);//create table


        Assert.assertEquals(0, table);



    }



}
