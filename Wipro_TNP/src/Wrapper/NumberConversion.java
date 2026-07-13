package Wrapper;

public class NumberConversion {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Please pass an integer as command line argument.");
            return;
        }

        int n = Integer.parseInt(args[0]);

        System.out.println("Given Number : " + n);
        System.out.println("Binary equivalent : " + Integer.toBinaryString(n));
        System.out.println("Octal equivalent : " + Integer.toOctalString(n));
        System.out.println("Hexadecimal equivalent : " + Integer.toHexString(n));
    }
}
