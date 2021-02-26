package com.udacity.restAPIBootstrap.controller;

import com.udacity.restAPIBootstrap.entity.Location;
import com.udacity.restAPIBootstrap.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LocationController {

    @Autowired
    private LocationService locationService;

    @GetMapping("/locations")
    public ResponseEntity<List<Location>> getAllLocation(){
       List<Location> locationList= locationService.retrieveLocation();

       return  new ResponseEntity<List<Location>>(locationList, HttpStatus.OK);
    }


    @GetMapping("{id}/location")
    public  ResponseEntity<String> getLocation(@PathVariable Integer id){
        String address = locationService.retrieveLocationById(id);
        return  new ResponseEntity<String>(address,HttpStatus.OK);
    }
}
