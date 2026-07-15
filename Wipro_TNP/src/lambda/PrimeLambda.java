package lambda;

import java.util.ArrayList;

public class PrimeLambda {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(7);
        al.add(25);
        al.add(17);
        al.add(19);
        al.add(20);
        al.add(31);
        al.add(45);
        al.add(53);
        al.add(61);
        al.add(72);
        al.add(89);
        al.add(97);
        al.add(100);
        al.add(2);
        al.add(3);
        al.add(5);
        al.add(11);
        al.add(13);
        al.add(29);
        al.add(37);
        al.add(41);
        al.add(43);
        al.add(47);
        al.add(59);

        System.out.println("Prime Numbers:");

        al.forEach(n -> {
            boolean prime = true;

            if (n < 2)
                prime = false;
            else {
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        prime = false;
                        break;
                    }
                }
            }

            if (prime)
                System.out.print(n + " ");
        });
    }
}