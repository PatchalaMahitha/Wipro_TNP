package StringPrograms;

public class RemoveX {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Usage: java RemoveX <String>");
            return;
        }

        String str = args[0];

        if (str.startsWith("x"))
            str = str.substring(1);

        if (str.endsWith("x"))
            str = str.substring(0, str.length() - 1);

        System.out.println(str);
    }
}