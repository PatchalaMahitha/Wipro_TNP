package Day3;

public class IsEven {

    public int isEven(int input) {
        if (input % 2 == 0)
            return 2;
        else
            return 1;
    }

    public static void main(String[] args) {
        IsEven obj = new IsEven();
        System.out.println(obj.isEven(10));
        System.out.println(obj.isEven(7));
        System.out.println(obj.isEven(0));
    }
}