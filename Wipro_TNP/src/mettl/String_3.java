package mettl;

import java.io.*;
import java.util.*;

public class String_3
{
    public int getCodeThroughStrings(String input1)
    {
        String[] words = input1.split(" ");

        int totalLength = 0;

        // Calculate total length of all words
        for (String word : words)
        {
            totalLength += word.length();
        }

        // Continuously add digits until a single digit is obtained
        while (totalLength >= 10)
        {
            int sum = 0;

            while (totalLength > 0)
            {
                sum += totalLength % 10;
                totalLength /= 10;
            }

            totalLength = sum;
        }

        return totalLength;
    }
}