package com.stackroute.pe4;

public class CheckName
{
    public boolean nameCheck(String inputString)
    {
        boolean isFound = inputString.matches("(.*)Harry(.*)");
        return isFound;
    }
}
