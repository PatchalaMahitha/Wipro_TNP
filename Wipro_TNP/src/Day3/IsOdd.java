package Day3;

public class IsOdd {

    public int isOdd(int input) {
        if (input % 2 != 0)
            return 2;
        else
            return 1;
    }

    public static void main(String[] args) {
        IsOdd obj = new IsOdd();
        System.out.println(obj.isOdd(9));
        System.out.println(obj.isOdd(10));
        System.out.println(obj.isOdd(0));
    }
}