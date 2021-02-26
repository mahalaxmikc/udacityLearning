package com.udacity.restAPIBootstrap.service;


import com.udacity.restAPIBootstrap.entity.Dog;
import com.udacity.restAPIBootstrap.repository.DogRepository;
import com.udacity.restAPIBootstrap.utility.DogNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DogServiceImpl implements  DogService{

    @Autowired
    DogRepository dogRepository;



    @Override
    public List<String> retrieveDogBreed() {

        return  retrieveDogs().stream().map(dog -> dog.getBreed()).collect(Collectors.toList());
    }



    @Override
    public String retrieveDogBreedById(Long dogID) {

        Optional<String> optionalBreed= Optional.ofNullable(dogRepository.findDogBreedByUid(dogID));
        String breed = optionalBreed.orElseThrow(DogNotFoundException::new);
        return breed;


    }

    @Override
    public List<String> retrieveDogNames() {
        return retrieveDogs().stream().map(dog -> dog.getName()).collect(Collectors.toList());
    }

    @Override
    public List<Dog> retrieveDogs() {
        return ((List<Dog>) dogRepository.findAll());
    }
}
