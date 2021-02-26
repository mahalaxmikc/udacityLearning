package com.udacity.restAPIBootstrap.service;


import com.udacity.restAPIBootstrap.entity.Location;
import com.udacity.restAPIBootstrap.repository.LocationRepository;
import com.udacity.restAPIBootstrap.utility.DogNotFoundException;
import com.udacity.restAPIBootstrap.utility.LocationNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationRepository locationRepository;

    @Override
    public List<Location> retrieveLocation() {


        return ((List<Location>) locationRepository.findAll());
    }

    @Override
    public String retrieveLocationById(Integer id) {
      Optional<String> optionalAddress= Optional.ofNullable(locationRepository.findLocationByUid(id));
      String address=optionalAddress.orElseThrow(LocationNotFoundException::new);
      return address;
    }
}
