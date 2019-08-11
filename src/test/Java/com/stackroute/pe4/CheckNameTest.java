package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckNameTest
{
    CheckName object;

    @Before
    public void setUp() throws Exception
    {
        this.object = new CheckName();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void givenInputStringShouldCheckForNameAndReturnPositiveResult()
    {
        boolean actualResult = object.nameCheck("This is Harry");
        assertTrue(actualResult);

    }

    @Test
    public void givenNegativeInputShouldReturnNegativeResult()
    {
        boolean actualResult = object.nameCheck("This is Jack");
        assertFalse(actualResult);
    }
}