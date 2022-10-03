package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class WordCountTest {

        WordCount object = new WordCount();
    @Test
    public void getCountTest(){

        //arrange
        String[] words = {"ba", "ba", "black", "sheep"};
        Map<String, Integer> expectedMap = new HashMap<>();
        expectedMap.put("ba", 2);
        expectedMap.put("ba", 2);
        expectedMap.put("black", 1);
        expectedMap.put("sheep", 1);

        //act
        Map<String, Integer> actualMap = object.getCount(words);

        //assert
        Assert.assertEquals(expectedMap, actualMap);

    }
    @Test
    public void getCountTest_GivenEmpty() {

        //arrange
        String[] words = {};
        Map<String, Integer> expectedMap = new HashMap<>();

        //act
        Map<String, Integer> actualMap = object.getCount(words);

        //assert
        Assert.assertEquals(expectedMap, actualMap);

    }
    @Test
    public void getCountTest_GivenNull() {

        //arrange
        String[] words;
        Map<String, Integer> expectedMap = new HashMap<>();

        //act
        Map<String, Integer> actualMap = object.getCount(null);

        //assert
        Assert.assertEquals(expectedMap, actualMap);
    }

}
