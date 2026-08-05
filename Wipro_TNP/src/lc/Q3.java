package lc;

public class Q3 {

    public static void main(String args[]) {

        int n = args.length;
        int[] a = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {

            // Convert String argument to integer
            a[i] = Integer.parseInt(args[i]);

            // Count marks >= 35
            if (a[i] >= 35) {
                count++;
            }
        }

        System.out.println(count);
    }
}