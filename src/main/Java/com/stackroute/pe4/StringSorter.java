package com.stackroute.pe4;

import java.util.ArrayList;
import java.util.Collections;

public class StringSorter
{
    public String sortString(String inputString)
    {
        String[] stringArray = inputString.split(" ");
        ArrayList<String> sortedList = new ArrayList<>();
        for (String string: stringArray)
            sortedList.add(string);
        Collections.sort(sortedList);

        StringBuilder sb = new StringBuilder();
        for (String string:sortedList)
            sb.append(string);
        String newSortedString = sb.toString();
        return newSortedString;

    }
}
