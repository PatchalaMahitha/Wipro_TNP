package methodreference;

public class TestDigitCount {

    public static void main(String[] args) {

        CountDigits cd = DigitCount::digitCount;

        System.out.println("Digits = " + cd.count(123456));
    }
}