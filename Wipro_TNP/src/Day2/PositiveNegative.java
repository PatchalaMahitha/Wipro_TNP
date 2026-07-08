package Day2;

public class PositiveNegative {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide a number as a program argument.");
            return;
        }

        int n = Integer.parseInt(args[0]);

        if (n > 0)
            System.out.println("Positive");
        else if (n < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }
}