package StringJoiner;

import java.util.ArrayList;
import java.util.StringJoiner;

public class NamesJoiner {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        for (String name : args) {
            names.add(name);
        }

        StringJoiner sj = new StringJoiner(", ", "{", "}");

        for (String name : names) {
            sj.add(name);
        }

        System.out.println(sj);
    }
}