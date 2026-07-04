package FlowControlStatements;

public class Sum {
	public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Please enter one integer number");
            return;
        }

        int num = Integer.parseInt(args[0]);

        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println(sum);
    }

}
