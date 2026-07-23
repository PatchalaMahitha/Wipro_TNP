package mettl;

public class num_1 {

    public int sumOfSumsOfDigits(int input1) {

        String s = String.valueOf(input1);
        int total = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int digit = s.charAt(i) - '0';
            total += digit * (i + 1);
        }

        return total;
    }
}