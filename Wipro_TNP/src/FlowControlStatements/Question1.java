package FlowControlStatements;

public class Question1 {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Please enter one integer.");
            return;
        }

        int num = Integer.parseInt(args[0]);

        if (num > 0)
            System.out.println("Positive");
        else if (num < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }

}
