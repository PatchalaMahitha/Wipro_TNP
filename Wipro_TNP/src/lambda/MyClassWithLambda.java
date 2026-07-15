package lambda;

public class MyClassWithLambda {

    public static void main(String[] args) {

        WordCoun wc = (str) -> {

            if (str == null || str.trim().isEmpty())
                return 0;

            return str.trim().split("\\s+").length;
        };

        String s = "Welcome to Wipro Java Training";

        System.out.println("Sentence : " + s);
        System.out.println("Word Count : " + wc.count(s));
    }
}