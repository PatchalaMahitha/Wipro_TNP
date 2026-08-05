package lc;

import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();

        int[] binary = new int[32];
        int i = 0;

        if (n == 0) {
            System.out.println("Binary = 0");
        } else {
            while (n > 0) {
                binary[i] = n % 2;
                n = n / 2;
                i++;
            }

            System.out.print("Binary = ");
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(binary[j]);
            }
        }

        sc.close();
    }
}