package Arrays;

public class Rearrange {
	public static void main(String[] args) {

        int[] arr = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }

        int[] result = new int[arr.length];
        int index = 0;

        // Even numbers
        for (int num : arr) {
            if (num % 2 == 0)
                result[index++] = num;
        }

        // Odd numbers
        for (int num : arr) {
            if (num % 2 != 0)
                result[index++] = num;
        }

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

}
