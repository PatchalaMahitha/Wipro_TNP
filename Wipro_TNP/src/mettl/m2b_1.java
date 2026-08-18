package mettl;

public class m2b_1 {

    public static int AddSub(int input1, int input2) {

        int result = 0;

        if (input2 == 1) {

            for (int i = input1; i >= 1; i--) {

                int position = input1 - i;

                if (position % 2 == 0)
                    result += i;
                else
                    result -= i;
            }

        } 
        else if (input2 == 2) {

            result = input1;

            for (int i = input1 - 1; i >= 1; i--) {

                int position = input1 - i;

                if (position % 2 == 0)
                    result -= i;
                else
                    result += i;
            }
        }

        return result;
    }
}