package com.udacity.restAPIBootstrap.controller;


import com.udacity.restAPIBootstrap.entity.Dog;
import com.udacity.restAPIBootstrap.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DogController {
    @Autowired
    private DogService dogService;


    public void setDogService(DogService dogService) {
        this.dogService = dogService;
    }

    @GetMapping("/allDogs/breeds")
    public ResponseEntity<List<String>> getAllDogBreeds(){
        List<String> breedList= dogService.retrieveDogBreed();
        return  new ResponseEntity<List<String>>(breedList, HttpStatus.OK);
    }

    @GetMapping("/allDog/names")
    public ResponseEntity<List<String>> getAllDogNames(){
        List<String> breedList= dogService.retrieveDogNames();
        return  new ResponseEntity<List<String>>(breedList, HttpStatus.OK);
    }

    @GetMapping("/allDogs")
    public ResponseEntity<List<Dog>> getAllDog(){
        List<Dog> dogList= dogService.retrieveDogs();
        return  new ResponseEntity<List<Dog>>(dogList, HttpStatus.OK);
    }

    @GetMapping("/dogBreed/{dogID}")
    public ResponseEntity<String> getDogBreedByID(@PathVariable long dogID){
        String breed = dogService.retrieveDogBreedById(dogID);
        return new ResponseEntity<String>(breed,HttpStatus.OK);
    }

}
