package com.stackroute.pe4;

public class ReplaceCharacters
{
    public boolean stringChecker(String inputString)
    {
        if (inputString.equals('d') || inputString.equals('l'))
            return true;
        else
            return false;
    }
    public String replaceCharacterFromString(String inputString)
    {
        String replacedString = inputString.replace('d','f').replace('l','t');
        return replacedString;

    }

}
