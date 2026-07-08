package Day2;

public class GreaterNumber {

    public static void main(String[] args) {
    	if (args.length == 0) {
    	    System.out.println("Please provide the required program arguments.");
    	    return;
    	}

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        if (a > b)
            System.out.println(a + " is greater");
        else if (b > a)
            System.out.println(b + " is greater");
        else
            System.out.println("Both are equal");
    }
}