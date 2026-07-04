package Arrays;

public class Remove {
	public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please pass array elements.");
            return;
        }

        int[] result = new int[args.length];

        int index = 0;

        for (String s : args) {

            int num = Integer.parseInt(s);

            if (num != 10) {
                result[index++] = num;
            }
        }

        for (int x : result) {
            System.out.print(x + " ");
        }
    }

}
