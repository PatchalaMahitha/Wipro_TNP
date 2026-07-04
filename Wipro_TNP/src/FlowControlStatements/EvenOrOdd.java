package FlowControlStatements;

public class EvenOrOdd {
	public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Please enter one integer.");
            return;
        }

        int num = Integer.parseInt(args[0]);

        if (num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

}
