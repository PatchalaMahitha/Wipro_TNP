package mettl;

public class day8_2 {

    public int digitSum(int input1) {

        boolean negative = input1 < 0;

        if (negative) {
            input1 = -input1;
        }

        while (input1 >= 10) {

            int sum = 0;

            while (input1 > 0) {
                sum += input1 % 10;
                input1 /= 10;
            }

            input1 = sum;
        }

        return negative ? -input1 : input1;
    }
}