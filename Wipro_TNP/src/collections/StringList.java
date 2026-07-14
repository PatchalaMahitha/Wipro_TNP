package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class StringList {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C");
        list.add("C++");
        list.add("JavaScript");

        Iterator<String> itr = list.iterator();

        System.out.println("Elements:");

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}