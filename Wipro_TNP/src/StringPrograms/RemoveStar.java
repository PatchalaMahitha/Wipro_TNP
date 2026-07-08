package StringPrograms;

public class RemoveStar {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Usage: java RemoveStar <String>");
            return;
        }

        String str = args[0];

        int index = str.indexOf('*');

        if (index == -1) {
            System.out.println(str);
            return;
        }

        String result = "";

        if (index > 1)
            result += str.substring(0, index - 1);

        if (index < str.length() - 2)
            result += str.substring(index + 2);

        System.out.println(result);
    }
}