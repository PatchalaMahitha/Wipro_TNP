package interfacesnewfeatures;

public class LambdaDemo {

    public static void main(String[] args) {

        Test t1 = (a, b, c) -> a + b + c;

        Test t2 = (a, b, c) -> a * b * c;

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        System.out.println("Addition = " + t1.myFunction(a, b, c));
        System.out.println("Multiplication = " + t2.myFunction(a, b, c));
    }
}