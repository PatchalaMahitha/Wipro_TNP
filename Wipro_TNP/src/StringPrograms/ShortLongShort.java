package StringPrograms;

public class ShortLongShort {

    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Usage: java ShortLongShort <String1> <String2>");
            return;
        }

        String a = args[0];
        String b = args[1];

        if (a.length() < b.length())
            System.out.println(a + b + a);
        else
            System.out.println(b + a + b);
    }
}