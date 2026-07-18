package mettl;

public class day9_1 {

    public int isPalinNum(int input1) {

        int original = input1;
        int reverse = 0;

        while (input1 > 0) {
            reverse = reverse * 10 + (input1 % 10);
            input1 /= 10;
        }

        if (original == reverse)
            return 2;
        else
            return 1;
    }
}