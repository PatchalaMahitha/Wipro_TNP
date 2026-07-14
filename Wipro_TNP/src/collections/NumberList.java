package collections;

import java.util.ArrayList;

public class NumberList {

    public static void main(String[] args) {

        ArrayList<Number> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(15.5);
        numbers.add(20L);
        numbers.add(25.75f);
        numbers.add(35);

        System.out.println("Numbers:");

        for(Number n : numbers) {
            System.out.println(n);
        }
    }
}