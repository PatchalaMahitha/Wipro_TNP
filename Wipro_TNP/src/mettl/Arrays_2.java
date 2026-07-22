package mettl;

import java.util.*;

public class Arrays_2 {

    public static class Result {
        public final int output1;
        public final int output2;

        public Result(int out1, int out2) {
            output1 = out1;
            output2 = out2;
        }
    }

    public Result findOriginalFirstAndSum(int[] input1, int input2) {

        int[] original = new int[input2];

        // Last element remains unchanged
        original[input2 - 1] = input1[input2 - 1];

        // Decode from right to left
        for (int i = input2 - 2; i >= 0; i--) {
            original[i] = input1[i] - original[i + 1];
        }

        // First number
        int out1 = original[0];

        // Sum of original array
        int out2 = 0;

        for (int i = 0; i < input2; i++) {
            out2 += original[i];
        }

        return new Result(out1, out2);
    }
}