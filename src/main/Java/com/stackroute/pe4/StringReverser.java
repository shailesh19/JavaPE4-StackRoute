package com.stackroute.pe4;

public class StringReverser
{



    public String displayStringReverse(String inputString)
    {
        String[] words=inputString.split(" ");
        String reversedString = "";
        for (int i=0;i<words.length;i++)
        {
            String word = words[i];
            String reverseWord = "";
            for (int j=word.length()-1; j>=0; j--)
            {
                reverseWord=reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        return reversedString.trim();
    }
}
