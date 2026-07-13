package io;

import java.io.*;
import java.util.Scanner;

public class FileCopy {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the input file name");
        String input = sc.nextLine();

        System.out.println("Enter the output file name");
        String output = sc.nextLine();

        FileInputStream fis = new FileInputStream(input);
        FileOutputStream fos = new FileOutputStream(output);

        int ch;

        while ((ch = fis.read()) != -1) {
            fos.write(ch);
        }

        fis.close();
        fos.close();

        System.out.println("File is copied.");

        sc.close();
    }
}