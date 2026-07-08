package StringPrograms;

public class MixString {

    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Usage: java MixString <String1> <String2>");
            return;
        }

        String a = args[0];
        String b = args[1];

        String result = "";

        int min = Math.min(a.length(), b.length());

        for (int i = 0; i < min; i++) {
            result += a.charAt(i);
            result += b.charAt(i);
        }

        if (a.length() > min)
            result += a.substring(min);

        if (b.length() > min)
            result += b.substring(min);

        System.out.println(result);
    }
}