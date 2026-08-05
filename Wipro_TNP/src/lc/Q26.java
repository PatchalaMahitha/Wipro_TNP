package lc;

import java.util.Scanner;

public class Q26 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();

        int[] a = new int[n1];
        int[] b = new int[n2];

        System.out.println("Enter first array:");

        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();

        System.out.println("Enter second array:");

        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();

        // Sort first array
        for (int i = 0; i < n1 - 1; i++) {
            for (int j = 0; j < n1 - 1 - i; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        // Sort second array
        for (int i = 0; i < n2 - 1; i++) {
            for (int j = 0; j < n2 - 1 - i; j++) {
                if (b[j] < b[j + 1]) {
                    int temp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = temp;
                }
            }
        }

        int[] merge = new int[n1 + n2];

        int k = 0;

        for (int i = 0; i < n1; i++)
            merge[k++] = a[i];

        for (int i = 0; i < n2; i++)
            merge[k++] = b[i];

        System.out.println("Merged Array:");

        for (int i = 0; i < merge.length; i++)
            System.out.print(merge[i] + " ");

        sc.close();
    }
}