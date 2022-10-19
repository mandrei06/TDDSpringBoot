package com.tddapp.springboottddapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


public class NoteController {

    // Attributes:
    private List<Note> noteList = new ArrayList<>();

    public int size() {
        return noteList.size();
    }

    public void addNote(Note note) {
        noteList.add(note);
    }

    public Note getNote(int id){
        return noteList.get(id);
    }


    public String displayNote(int id) {
        Note note = noteList.get(id);
        return note.toString();
    }

    public void deleteNote(int index) {
        // check if its not empty
        noteList.remove(index);
    }
    public void updateNote(int id,String completionDate, String description, String text, boolean state){
        Note note=getNote(id);
        note.update(completionDate,description, text, state);
    }
}
