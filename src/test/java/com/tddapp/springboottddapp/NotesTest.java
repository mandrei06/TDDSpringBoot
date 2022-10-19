package com.tddapp.springboottddapp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NotesTest {

    NoteController noteController;
    Note note;

    @Before
    public void initialization() {
        noteController = new NoteController();
        note = new Note(noteController.size() ,
                "01/02/2022",
                "30/02/2022",
                "my note description",
                "Do this and that",
                true,
                "wwww.link.com",
                "do it in the morning",
                true
        );
    }

    @Test
    public void addNoteTest() {

        int currentNumberOfNotes = noteController.size();
        noteController.addNote(note);
        Assert.assertEquals(currentNumberOfNotes + 1, noteController.size());

    }

    @Test
    public void deleteNoteTest() {
        noteController.addNote(note);
        int currentNumberOfNotes = noteController.size();
        noteController.deleteNote(0);
        Assert.assertEquals(currentNumberOfNotes - 1, noteController.size());

    }

    @Test
    public void updateNoteTest() {
        note.update("01/01/2023", "New description", "New text", true);
        Assert.assertEquals(note.getCompletioDate(), "01/01/2023");

    }


    @Test
    public void displayNoteTest() {

        noteController.addNote(note);
        // Note actualNote=note.displayNote(note.id);
        String actualNote = noteController.displayNote(note.getId());
        Assert.assertEquals(actualNote, note.toString());
    }


}
