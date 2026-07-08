package Day2;

public class SumEvenOdd {

    public static void main(String[] args) {

        if(args.length<2){
            System.out.println("Please provide two numbers.");
            return;
        }

        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);

        int sum=a+b;

        System.out.println("Sum = "+sum);

        if(sum%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}