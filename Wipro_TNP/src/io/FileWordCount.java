package io;

import java.io.*;
import java.util.*;

public class FileWordCount {

    public static void main(String[] args) throws IOException {

        if (args.length != 2) {
            System.out.println("Usage: java FileWordCount inputFile outputFile");
            return;
        }

        String inputFile = args[0];
        String outputFile = args[1];

        TreeMap<String, Integer> map = new TreeMap<>();

        Scanner sc = new Scanner(new File(inputFile));

        while (sc.hasNext()) {

            String word = sc.next();

            word = word.replaceAll("[^a-zA-Z]", "");

            if (word.length() > 0) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        sc.close();

        PrintWriter pw = new PrintWriter(new FileWriter(outputFile));

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            pw.println(e.getKey() + " : " + e.getValue());
        }

        pw.close();

        System.out.println("Word count written to " + outputFile);
    }
}