package Day2;

public class EvenOdd {

    public static void main(String[] args) {

        if(args.length==0){
            System.out.println("Please provide a number.");
            return;
        }

        int n=Integer.parseInt(args[0]);

        if(n%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}