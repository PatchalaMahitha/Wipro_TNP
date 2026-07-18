package mettl;

public class day10_1 {

    public String secondWordUpperCase(String input1) {

        String[] words = input1.trim().split("\\s+");

        if (words.length < 2) {
            return "LESS";
        }

        return words[1].toUpperCase();
    }
}