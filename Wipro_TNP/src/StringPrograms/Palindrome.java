package StringPrograms;

public class Palindrome {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Usage: java Palindrome <String>");
            return;
        }

        String str = args[0];
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        if (str.equalsIgnoreCase(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}