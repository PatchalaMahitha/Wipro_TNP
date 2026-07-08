package StringPrograms;

public class RepeatFirstTwo {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Usage: java RepeatFirstTwo <String>");
            return;
        }

        String str = args[0];

        String firstTwo;

        if (str.length() >= 2)
            firstTwo = str.substring(0, 2);
        else
            firstTwo = str;

        String result = "";

        for (int i = 0; i < str.length(); i++)
            result += firstTwo;

        System.out.println(result);
    }
}