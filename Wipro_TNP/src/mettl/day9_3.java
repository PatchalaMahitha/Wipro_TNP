package mettl;

public class day9_3 {

    public int totalHillWeight(int input1, int input2, int input3) {

        int total = 0;

        for (int i = 1; i <= input1; i++) {

            int weight = input2 + (i - 1) * input3;

            total += i * weight;
        }

        return total;
    }
}