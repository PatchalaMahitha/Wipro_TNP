package methodreference;

public class TestFactorial {

    public static void main(String[] args) {

        Factorial obj = new Factorial();

        MyFactorial mf = obj::factorial;

        System.out.println("Factorial = " + mf.calculate(5));
    }
}