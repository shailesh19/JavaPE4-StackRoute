package com.stackroute.pe4;

public class OccurenceCounter
{
    public int countOccurences(String inputString, String word)
    {
        String[] string = inputString.split(" ");
        int count =0;
        for (int i=0;i<string.length;i++)
        {
            if (word.equals(string[i]))
                count++;
        }
        return count;
    }
}
