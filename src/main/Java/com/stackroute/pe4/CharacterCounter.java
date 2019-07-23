package com.stackroute.pe4;

public class CharacterCounter
{
    public int countCharacterMethod (String inputString, String character)
    {
        int stringLength = inputString.length();
        int lengthWithoutChar = inputString.replaceAll(character, "").length();
        int totalCharCount = stringLength - lengthWithoutChar;
        return  totalCharCount;
    }
}
