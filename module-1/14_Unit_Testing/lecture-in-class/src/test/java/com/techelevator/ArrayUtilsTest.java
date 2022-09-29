package com.techelevator;

import org.junit.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ArrayUtilsTest {
    private int[] array ;
    private ArrayUtils utils = new ArrayUtils();

    @Before
    public void setup() {
        array = new int[]{6,5,4,9,8,7,12,3,4,-1,-50};
    }

    @After
    public void teardown() {

    }

    @Test
    public void badTestMaterial(){

        for (int i = 0; i < array.length ; i++) {
            array[i] += 35;
        }

    }


    @Test
    public void max_withDefaultArray_returns12(){

        //Arrange
        int expectedResult = 12;

        //Act
        int actualResult = utils.max(array);

        //Assert
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void average_asStaticMethod_returntrue(){

        //Arrange
        int expected = 0;

        //Act
        int result = ArrayUtils.average(array);
        //Assert

        Assert.assertEquals(expected,result);
        System.out.println(ArrayUtils.average(array));
    }

    @Test
    public void average_withTestArray_returnTrue(){

        //Arrange
        int[] test = new int[]{2,4,6};
        int expected = 4;
        //Act
        //Assert
        //Act
        int result = ArrayUtils.average(test);
        //Assert

        Assert.assertEquals(expected,result);
        System.out.println(ArrayUtils.average(test));
    }
}
