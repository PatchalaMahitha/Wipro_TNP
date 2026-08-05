package lc;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        System.out.println("Enter 20 elements:");
        for (int i = 0; i < 20; i++) {
            arr[i] = sc.nextInt();
        }
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int min3 = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }
            if (num < min1) {
                min3 = min2;
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min3 = min2;
                min2 = num;
            } else if (num < min3) {
                min3 = num;
            }
        }
        System.out.println("Maximum 3 elements:");
        System.out.println(max1 + " " + max2 + " " + max3);

        System.out.println("Minimum 3 elements:");
        System.out.println(min1 + " " + min2 + " " + min3);
        sc.close();
    }
}