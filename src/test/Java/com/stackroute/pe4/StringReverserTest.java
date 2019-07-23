package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverserTest
{
    StringReverser object;

    @Before
    public void setUp() throws Exception
    {
        this.object=new StringReverser();
    }

    @After
    public void tearDown() throws Exception
    {
    }

    @Test
    public void givenStringInputShouldReturnTheWordsReversed()
    {
        String actualResult=object.displayStringReverse("a quick brown fox jumps over the lazy dog");
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god",actualResult);
    }
}