package mettl;

public class day7_1 {

    public int nonRepeatDigitsCount(int input1) {

        int[] freq = new int[10];

        while (input1 > 0) {
            int digit = input1 % 10;
            freq[digit]++;
            input1 /= 10;
        }

        int count = 0;

        for (int i = 0; i < 10; i++) {
            if (freq[i] == 1) {
                count++;
            }
        }

        return count;
    }
}