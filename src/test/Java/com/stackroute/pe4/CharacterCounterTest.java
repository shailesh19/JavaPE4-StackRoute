package com.stackroute.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterCounterTest {

CharacterCounter object;

    @org.junit.Before
    public void setUp() throws Exception
    {
        this.object = new CharacterCounter();
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void countCharacterMethod() {
    }

    @Test
    public void givenStringInputShouldReturnCharacterCount()
    {
        int actualResult = object.countCharacterMethod("This is Java is Java is Java and again Java","a");
        assertEquals(11,actualResult);
    }
}