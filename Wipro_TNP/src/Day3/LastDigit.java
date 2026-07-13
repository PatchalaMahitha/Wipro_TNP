package Day3;

public class LastDigit {

    public int getLastDigit(int input) {
        return Math.abs(input % 10);
    }

    public static void main(String[] args) {
        LastDigit obj = new LastDigit();

        System.out.println(obj.getLastDigit(197));
        System.out.println(obj.getLastDigit(-197));
    }
}