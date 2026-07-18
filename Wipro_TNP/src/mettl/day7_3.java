package mettl;

public class day7_3 {

    public int countPrimesInRange(int input1, int input2) {

        int count = 0;

        for (int i = input1; i <= input2; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        return count;
    }

    private boolean isPrime(int n) {

        if (n < 2)
            return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}