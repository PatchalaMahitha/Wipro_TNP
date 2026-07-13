package Day3;

public class SecondLastDigit {

    public int getSecondLastDigit(int input) {

        input = Math.abs(input);

        if (input < 10)
            return -1;

        return (input / 10) % 10;
    }

    public static void main(String[] args) {

        SecondLastDigit obj = new SecondLastDigit();

        System.out.println(obj.getSecondLastDigit(197));
        System.out.println(obj.getSecondLastDigit(-197));
        System.out.println(obj.getSecondLastDigit(5));
    }
}