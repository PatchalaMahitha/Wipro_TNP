package FlowControlStatements;

public class PrimeOrNot {
	public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Please enter one integer number");
            return;
        }

        int n = Integer.parseInt(args[0]);

        if (n <= 1) {
            System.out.println(n + " is not a Prime Number");
            return;
        }

        boolean prime = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime)
            System.out.println(n + " is a Prime Number");
        else
            System.out.println(n + " is not a Prime Number");
    }

}
