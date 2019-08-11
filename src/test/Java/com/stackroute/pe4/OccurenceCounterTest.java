package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccurenceCounterTest
{
    OccurenceCounter object;

    @Before
    public void setUp() throws Exception
    {
        this.object = new OccurenceCounter();
    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void givenStringAndWordShouldReturnNumberOfOccurence()
    {
        int actualResult = object.countOccurences("hello world hello", "hello");
        assertEquals(2,actualResult);
    }

    @Test
    public void givenStringAndWordShouldReturnNegativeResult()
    {
        int actualResult = object.countOccurences("Hi there!", "hey");
        assertEquals(0,actualResult);
    }
}