package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringSorterTest
{
    StringSorter object;
    @Before
    public void setUp() throws Exception
    {
        this.object = new StringSorter();
    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void givenStringInputShouldReturnSortedWordsList()
    {
        String actualResult = object.sortString("Banana Apple Cat");
        assertEquals("AppleBananaCat",actualResult);

    }
}