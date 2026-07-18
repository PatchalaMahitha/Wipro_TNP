package mettl;

public class day10_4 {

    public int MostFrequentDigit(int input1, int input2, int input3, int input4) {

        int[] freq = new int[10];

        countDigits(input1, freq);
        countDigits(input2, freq);
        countDigits(input3, freq);
        countDigits(input4, freq);

        int maxFreq = 0;
        int result = 0;

        for (int i = 0; i <= 9; i++) {
            if (freq[i] >= maxFreq) {
                maxFreq = freq[i];
                result = i; // Returns the largest digit in case of a tie
            }
        }

        return result;
    }

    private void countDigits(int num, int[] freq) {

        num = Math.abs(num);

        if (num == 0) {
            freq[0]++;
            return;
        }

        while (num > 0) {
            freq[num % 10]++;
            num /= 10;
        }
    }
}