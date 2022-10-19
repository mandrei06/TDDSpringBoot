package com.tddapp.springboottddapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    NoteController noteController;



    @GetMapping("/size")
    public void printSize(){
        System.out.println(noteController.size());
    }
}
