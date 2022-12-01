package com.techelevator.UnitedStates.controllers;

import com.techelevator.UnitedStates.model.CatFact;
import com.techelevator.UnitedStates.services.CatFactService;
import com.techelevator.UnitedStates.services.ICatFactService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatController {

    private ICatFactService catFactService;

    public CatController(ICatFactService catFactService) {
        this.catFactService = catFactService;
    }

    @RequestMapping(path="/catFact", method= RequestMethod.GET)
    public CatFact getCatFact(){

        return catFactService.getFact();
    }
}
