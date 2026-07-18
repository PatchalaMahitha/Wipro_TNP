package mettl;

public class day5_1 {

    public int countEvensOdds(int input1, int input2, int input3,
                              int input4, int input5, String input6) {

        int count = 0;

        int[] arr = {input1, input2, input3, input4, input5};

        if (input6.equalsIgnoreCase("even")) {

            for (int n : arr) {
                if (n % 2 == 0) {
                    count++;
                }
            }

        } else if (input6.equalsIgnoreCase("odd")) {

            for (int n : arr) {
                if (n % 2 != 0) {
                    count++;
                }
            }
        }

        return count;
    }
}