package lc;

public class Q4 {

    public static void main(String args[]) {

        int n = args.length;
        int[] a = new int[n];

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < n; i++) {

            a[i] = Integer.parseInt(args[i]);

            if (a[i] >= 0) {
                count1++;
            } else {
                count2++;
            }
        }

        System.out.println("Positive or Zero: " + count1);
        System.out.println("Negative: " + count2);
    }
}