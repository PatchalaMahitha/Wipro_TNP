package mettl;

public class day6_1 {

    public long nthFibonacci(int input1) {

        if (input1 == 1)
            return 0;

        if (input1 == 2)
            return 1;

        long a = 0;
        long b = 1;

        for (int i = 3; i <= input1; i++) {
            long c = a + b;
            a = b;
            b = c;
        }

        return b;
    }
}