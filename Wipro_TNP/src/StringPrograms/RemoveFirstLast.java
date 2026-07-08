package StringPrograms;

public class RemoveFirstLast {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Usage: java RemoveFirstLast <String>");
            return;
        }

        String str = args[0];

        if (str.length() <= 2)
            System.out.println("");
        else
            System.out.println(str.substring(1, str.length() - 1));
    }
}