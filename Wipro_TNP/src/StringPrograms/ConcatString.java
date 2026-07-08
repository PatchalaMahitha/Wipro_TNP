package StringPrograms;

public class ConcatString {
	public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Usage: java ConcatString <String1> <String2>");
            return;
        }

        String s1 = args[0];
        String s2 = args[1];

        if (s1.charAt(s1.length() - 1) == s2.charAt(0))
            System.out.println((s1 + s2.substring(1)).toLowerCase());
        else
            System.out.println((s1 + s2).toLowerCase());
    }

}
