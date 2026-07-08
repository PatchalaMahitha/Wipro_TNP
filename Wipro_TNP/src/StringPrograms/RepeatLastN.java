package StringPrograms;

public class RepeatLastN {

    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Usage: java RepeatLastN <String> <Number>");
            return;
        }

        String str = args[0];
        int n = Integer.parseInt(args[1]);

        String last = str.substring(str.length() - n);

        String result = "";

        for (int i = 0; i < n; i++) {
            result += last;
        }

        System.out.println(result);
    }
}