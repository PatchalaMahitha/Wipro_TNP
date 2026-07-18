package mettl;

public class day9_2 {

    public int isPalinNumPossible(int input1) {

        input1 = Math.abs(input1);

        int[] count = new int[10];

        while (input1 > 0) {
            count[input1 % 10]++;
            input1 /= 10;
        }

        int oddCount = 0;

        for (int i = 0; i < 10; i++) {
            if (count[i] % 2 != 0) {
                oddCount++;
            }
        }

        return (oddCount <= 1) ? 2 : 1;
    }
}