package mettl;

public class day7_2 {

    public int uniqueDigitsCount(int input1) {

        input1 = Math.abs(input1);

        boolean[] seen = new boolean[10];

        while (input1 > 0) {
            int digit = input1 % 10;
            seen[digit] = true;
            input1 /= 10;
        }

        int count = 0;

        for (int i = 0; i < 10; i++) {
            if (seen[i]) {
                count++;
            }
        }

        return count;
    }
}