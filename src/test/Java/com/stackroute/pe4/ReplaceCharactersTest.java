package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharactersTest
{
    ReplaceCharacters object;

    @Before
    public void setUp() throws Exception
    {
        this.object = new ReplaceCharacters();
    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void givenInputStringShouldCheckForCharacters()
    {
        boolean actualResult = object.stringChecker("hey there!");
        assertEquals(false,actualResult);
    }

    @Test
    public void givenStringShouldReplaceCharacterAndReturnNewString()
    {
       String actualResult =  object.replaceCharacterFromString("daily dry");
       assertEquals("faily fry",actualResult);
    }

}