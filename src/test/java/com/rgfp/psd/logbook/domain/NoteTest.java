package com.rgfp.psd.logbook.domain;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NoteTest {

    @Test
    public  void  TestNote1()  {
        //igualar mi valor con caracter ingresado y que este tenga largo 10 caracteres
        Note NoteService = new Note();
        assertEquals("",NoteService.getSummary());
    }
    @Test
    public  void  TestNote2()  {
        //esperar 10 caracteres dese la clase Note
        Note noteService = new Note();
        noteService.setContent("hola mundo 2018");
        assertEquals("hola mundo",noteService.getSummary());
    }
    @Test
    public  void  TestNote3()  {
        Note noteService = new Note();
        noteService.setContent("super");
        assertEquals("super",noteService.getSummary());
    }



}