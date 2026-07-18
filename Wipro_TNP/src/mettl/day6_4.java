package mettl;

public class day6_4 {

    public int nFactorial(int input1) {

        int fact = 1;

        for (int i = 1; i <= input1; i++) {
            fact *= i;
        }

        return fact;
    }
}