package Arrays;
import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please pass array elements.");
            return;
        }

        int[] arr = new int[args.length];

        for (int i = 0; i < args.length; i++)
            arr[i] = Integer.parseInt(args[i]);

        Arrays.sort(arr);

        for (int x : arr)
            System.out.print(x + " ");
    }

}
