package lc;

import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.println("Smallest exact divisor = " + i);
                break;
            }
        }

        sc.close();
    }
}