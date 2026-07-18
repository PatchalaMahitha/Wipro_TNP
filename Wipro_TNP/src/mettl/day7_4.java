package mettl;

public class day7_4 {

    public int allDigitsCount(int input1) {

        input1 = Math.abs(input1);

        if (input1 == 0) {
            return 1;
        }

        int count = 0;

        while (input1 > 0) {
            count++;
            input1 /= 10;
        }

        return count;
    }
}