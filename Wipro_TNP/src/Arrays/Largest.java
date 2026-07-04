package Arrays;
import java.util.Arrays;

public class Largest {
	public static void main(String[] args) {

    if (args.length < 2) {
        System.out.println("Please pass at least two numbers.");
        return;
    }

    int[] arr = new int[args.length];

    for (int i = 0; i < args.length; i++)
        arr[i] = Integer.parseInt(args[i]);

    Arrays.sort(arr);

    System.out.println("Smallest 1 = " + arr[0]);
    System.out.println("Smallest 2 = " + arr[1]);

    System.out.println("Largest 2 = " + arr[arr.length - 2]);
    System.out.println("Largest 1 = " + arr[arr.length - 1]);
}

}
