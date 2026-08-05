package lc;

public class Q5 {

    public static void main(String args[]) {

        int n = args.length;
        int[] a = new int[n];

        int even = 0;
        int odd = 0;
        int zero = 0;

        for (int i = 0; i < n; i++) {

            a[i] = Integer.parseInt(args[i]);

            if (a[i] == 0) {
                zero++;
            } else if (a[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
        System.out.println("Zero = " + zero);
    }
}