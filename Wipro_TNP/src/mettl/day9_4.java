package mettl;

public class day9_4 {

    public int createPIN(int input1, int input2, int input3) {

        int m1 = input1 / 100;
        int t1 = (input1 / 10) % 10;
        int u1 = input1 % 10;

        int m2 = input2 / 100;
        int t2 = (input2 / 10) % 10;
        int u2 = input2 % 10;

        int m3 = input3 / 100;
        int t3 = (input3 / 10) % 10;
        int u3 = input3 % 10;

        int hund = Math.min(m1, Math.min(m2, m3));
        int tens = Math.min(t1, Math.min(t2, t3));
        int uni = Math.min(u1, Math.min(u2, u3));

        int max = 0;

        int[] digits = {m1, t1, u1, m2, t2, u2, m3, t3, u3};

        for (int d : digits) {
            if (d > max) {
                max = d;
            }
        }

        return max * 1000 + hund * 100 + tens * 10 + uni;
    }
}