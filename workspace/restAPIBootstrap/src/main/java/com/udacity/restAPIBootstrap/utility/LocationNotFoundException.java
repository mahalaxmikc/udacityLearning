package com.udacity.restAPIBootstrap.utility;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND,reason = "Location Not Found ,Invalid ID")
public class LocationNotFoundException extends  RuntimeException{

    public LocationNotFoundException(){

    }

    public LocationNotFoundException(String message) {
        super(message);
    }
}
