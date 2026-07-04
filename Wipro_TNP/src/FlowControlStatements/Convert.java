package FlowControlStatements;

public class Convert {
	public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Please enter one character.");
            return;
        }

        char ch = args[0].charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " -> " + Character.toUpperCase(ch));
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " -> " + Character.toLowerCase(ch));
        } else {
            System.out.println("Invalid Alphabet");
        }
    }
}
