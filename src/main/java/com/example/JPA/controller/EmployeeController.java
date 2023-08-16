package com.example.JPA.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @GetMapping("/welcome")
    public ResponseEntity<String> welcome() {
        String text="This is our welcome page";
        return new ResponseEntity<>(text,HttpStatus.CREATED);
    }
}
