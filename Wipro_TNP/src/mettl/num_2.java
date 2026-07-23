package mettl;

public class num_2 {

    public int sumOfPowerOfDigits(int input1) {

        String str = Integer.toString(input1);
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            int currentDigit = str.charAt(i) - '0';

            if (i == str.length() - 1) {
                // Last digit raised to power 0
                sum += 1;
            } else {
                int nextDigit = str.charAt(i + 1) - '0';
                sum += (int) Math.pow(currentDigit, nextDigit);
            }
        }

        return sum;
    }
}