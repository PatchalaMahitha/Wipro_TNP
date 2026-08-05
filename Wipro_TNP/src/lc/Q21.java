package lc;

import java.util.Scanner;

public class Q21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        String rev = "";

        for (int i = s2.length() - 1; i >= 0; i--) {
            rev += s2.charAt(i);
        }

        String s3 = s1 + rev;

        System.out.println("Result = " + s3);

        sc.close();
    }
}