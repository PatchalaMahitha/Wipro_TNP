package miniproject10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String 1");
        String s1 = sc.nextLine();

        System.out.println("Enter String 2");
        String s2 = sc.nextLine();

        ArrayList<String> result = StringOperations.performOperations(s1, s2);

        System.out.println(result);

        sc.close();
    }
}