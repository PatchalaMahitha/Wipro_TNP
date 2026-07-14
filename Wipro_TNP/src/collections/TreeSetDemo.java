package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<String> tree = new TreeSet<>();

        tree.add("India");
        tree.add("USA");
        tree.add("Japan");
        tree.add("Australia");
        tree.add("Canada");

        System.out.println("Original TreeSet");

        System.out.println(tree);

        System.out.println();

        System.out.println("Reverse Order");

        System.out.println(tree.descendingSet());

        System.out.println();

        System.out.println("Using Iterator");

        Iterator<String> itr = tree.iterator();

        while (itr.hasNext()) {

            System.out.println(itr.next());

        }

        System.out.println();

        String search = "Japan";

        if (tree.contains(search)) {

            System.out.println(search + " exists.");

        } else {

            System.out.println(search + " does not exist.");

        }

    }

}