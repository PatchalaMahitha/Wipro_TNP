package mettl;

public class Arrays_3 {

    public int mostFrequentlyOccurringDigit(int[] input1, int input2) {

        int[] freq = new int[10];

        // Count frequency of each digit
        for (int i = 0; i < input2; i++) {

            int num = input1[i];

            // Handle 0 separately
            if (num == 0) {
                freq[0]++;
            }

            // Handle negative numbers
            num = Math.abs(num);

            while (num > 0) {
                int digit = num % 10;
                freq[digit]++;
                num = num / 10;
            }
        }

        // Find most frequently occurring digit
        // In case of tie, larger digit is selected
        int answer = 0;

        for (int digit = 0; digit <= 9; digit++) {

            if (freq[digit] >= freq[answer]) {
                answer = digit;
            }
        }

        return answer;
    }
}