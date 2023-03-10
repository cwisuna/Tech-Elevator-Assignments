package com.techelevator.locations.controllers;

import com.techelevator.locations.dao.LocationDao;
import com.techelevator.locations.model.Location;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/locations")
public class LocationController {

    private LocationDao dao;

    public LocationController(LocationDao dao) {
        this.dao = dao;
    }

    @RequestMapping(path = "", method = RequestMethod.GET)
    public List<Location> list() {
        return dao.list();
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Location get(@PathVariable int id) {
        Location location = dao.get(id);
        if (location == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Location not found");
        } else {
            return location;
        }
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Location add(@RequestBody Location location) {
        return dao.create(location);
    }

}
