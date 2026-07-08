package StringJoiner;

import java.util.StringJoiner;

public class MergeJoiner {

    public static void main(String[] args) {

        // First half of arguments -> s1
        // Second half -> s2

        int mid = args.length / 2;

        StringJoiner s1 = new StringJoiner("-");
        StringJoiner s2 = new StringJoiner("-");

        for (int i = 0; i < mid; i++) {
            s1.add(args[i]);
        }

        for (int i = mid; i < args.length; i++) {
            s2.add(args[i]);
        }

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        StringJoiner merge1 = new StringJoiner("-");
        merge1.merge(s1);
        merge1.merge(s2);

        System.out.println("\n(i) s1 merged to s2:");
        System.out.println(merge1);

        StringJoiner merge2 = new StringJoiner("-");
        merge2.merge(s2);
        merge2.merge(s1);

        System.out.println("\n(ii) s2 merged to s1:");
        System.out.println(merge2);
    }
}