package com.techelevator.UnitedStates.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    public TestController(){

    }

    @RequestMapping(path="/", method= RequestMethod.GET)
    public String[] testMethod(){
        return new String[]{"one","two", "three", "four"};
    }
}
