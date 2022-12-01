package com.techelevator.UnitedStates.controllers;

import com.techelevator.UnitedStates.dao.ParkDao;
import com.techelevator.UnitedStates.model.Park;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class ParkController {
    private ParkDao parkDao;


    public ParkController(ParkDao parkDao){
       this.parkDao = parkDao;
    }

    @RequestMapping(path="/park/{id}", method= RequestMethod.GET)
    public Park getOnePark(@PathVariable int id){
        return this.parkDao.getOnePark(id);
    }

    @RequestMapping(path="/park", method= RequestMethod.GET)
    public List<Park> getAllParks(){
        return this.parkDao.getAllParks();
    }
}
