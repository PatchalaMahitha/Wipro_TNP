package mettl;

public class m2b_3 {

    public static int series(int input1, int input2, int input3, int input4) {

        int a = input1;
        int b = input2;
        int c = input3;
        int N = input4;

        if (N == 1)
            return a;

        if (N == 2)
            return b;

        if (N == 3)
            return c;

        int gap1 = b - a;
        int gap2 = c - b;

        int result = c;

        for (int i = 4; i <= N; i++) {

            if (i % 2 == 0)
                result += gap1;
            else
                result += gap2;
        }

        return result;
    }
}