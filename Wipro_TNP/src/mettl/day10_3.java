package mettl;

public class day10_3 {

    public int weightofstring(String input1, int input2) {

        int sum = 0;
        input1 = input1.toLowerCase();

        for (int i = 0; i < input1.length(); i++) {

            char ch = input1.charAt(i);

            if (ch >= 'a' && ch <= 'z') {

                if (input2 == 0 &&
                    (ch == 'a' || ch == 'e' || ch == 'i' ||
                     ch == 'o' || ch == 'u')) {
                    continue;
                }

                sum += (ch - 'a' + 1);
            }
        }

        return sum;
    }
}