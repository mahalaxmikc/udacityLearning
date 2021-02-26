package com.udacity.restAPIBootstrap.service;

import com.udacity.restAPIBootstrap.entity.Location;

import java.util.List;

public interface LocationService {

    public List<Location> retrieveLocation();
    public String retrieveLocationById(Integer id);
}
