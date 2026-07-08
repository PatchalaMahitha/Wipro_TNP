package StringPrograms;

public class FirstHalf {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Usage: java FirstHalf <String>");
            return;
        }

        String str = args[0];

        if (str.length() % 2 == 0)
            System.out.println(str.substring(0, str.length() / 2));
        else
            System.out.println("null");
    }
}