package mettl;

class Result {
    int count;
    int maxLength;

    Result(int count, int maxLength) {
        this.count = count;
        this.maxLength = maxLength;
    }
}

public class Arrays_1 {

    public Result findResult(int[] input1, int input2) {

        int count = 0;
        int maxLength = 0;
        int i = 0;

        while (i < input2 - 1) {
            if (input1[i] > input1[i + 1]) {
                count++;
                int length = 2;
                i++;

                while (i < input2 - 1 &&
                       input1[i] > input1[i + 1]) {
                    length++;
                    i++;
                }

                if (length > maxLength) {
                    maxLength = length;
                }
            } else {
                i++;
            }
        }

        return new Result(count, maxLength);
    }
}