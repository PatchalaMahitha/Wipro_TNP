package ClassesAndObjects;

public class Calculator {

    // Method for integer power
    static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    // Method for double power
    static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }

    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Please enter 2 arguments.");
            return;
        }

        // Integer version
        int intNum = Integer.parseInt(args[0]);
        int intPow = Integer.parseInt(args[1]);

        // Double version
        double doubleNum = Double.parseDouble(args[0]);

        System.out.println("powerInt(" + intNum + "," + intPow + ") = "
                + powerInt(intNum, intPow));

        System.out.println("powerDouble(" + doubleNum + "," + intPow + ") = "
                + powerDouble(doubleNum, intPow));
    }
}