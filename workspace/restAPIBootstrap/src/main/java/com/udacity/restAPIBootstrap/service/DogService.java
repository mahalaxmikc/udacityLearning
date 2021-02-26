package com.udacity.restAPIBootstrap.service;

import com.udacity.restAPIBootstrap.entity.Dog;

import java.util.List;

public interface DogService {

    public List<String> retrieveDogBreed();
    public String   retrieveDogBreedById(Long dogID);
    public List<String> retrieveDogNames();
    public List<Dog> retrieveDogs();


}
