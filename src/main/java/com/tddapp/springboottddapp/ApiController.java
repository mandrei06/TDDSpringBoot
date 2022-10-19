package com.tddapp.springboottddapp;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    NoteController noteController = new NoteController();



    @GetMapping("/size")
    public String printSize(){
        return "Size: " + noteController.size();
    }

    // POST

    @PostMapping("/notes/add")
    public String newNote(Model model){
        Note note = new Note(noteController.size() ,
                "01/02/2022",
                "30/02/2022",
                "my note description",
                "Do this and that",
                true,
                "wwww.link.com",
                "do it in the morning",
                true
        );

        noteController.addNote(note);
        return note.toString();
    }

    // DELETE


    // UPDATE


}
