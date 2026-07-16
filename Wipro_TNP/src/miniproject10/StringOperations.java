package miniproject10;

import java.util.ArrayList;

public class StringOperations {

    public static ArrayList<String> performOperations(String s1, String s2) {

        ArrayList<String> list = new ArrayList<>();

        // Operation 1
        StringBuilder op1 = new StringBuilder();
        int index = 0;
        while (index < s1.length()) {
            if (index % 2 == 1) {
                op1.append(s2);
            } else {
                op1.append(s1.charAt(index));
            }
            index++;
        }
        list.add(op1.toString());

        // Operation 2
        int first = s1.indexOf(s2);
        int last = s1.lastIndexOf(s2);

        if (first != -1 && first != last) {
            String reverse = new StringBuilder(s2).reverse().toString();
            String op2 = s1.substring(0, last) + reverse
                    + s1.substring(last + s2.length());
            list.add(op2);
        } else {
            list.add(s1 + s2);
        }

        // Operation 3
        if (first != -1 && first != last) {
            String op3 = s1.replaceFirst(s2, "");
            list.add(op3);
        } else {
            list.add(s1);
        }

        // Operation 4
        int mid;
        if (s2.length() % 2 == 0)
            mid = s2.length() / 2;
        else
            mid = s2.length() / 2 + 1;

        String firstHalf = s2.substring(0, mid);
        String secondHalf = s2.substring(mid);

        list.add(firstHalf + s1 + secondHalf);

        // Operation 5
        String op5 = s1;

        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            op5 = op5.replace(ch, '*');
        }

        list.add(op5);

        return list;
    }
}