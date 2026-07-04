package Arrays;

public class Middle {
	public static void main(String[] args) {

        if (args.length != 6) {
            System.out.println("Please enter 6 integers.");
            return;
        }

        int[] a = new int[3];
        int[] b = new int[3];

        for (int i = 0; i < 3; i++)
            a[i] = Integer.parseInt(args[i]);

        for (int i = 0; i < 3; i++)
            b[i] = Integer.parseInt(args[i + 3]);

        System.out.println(a[1] + " " + b[1]);
    }

}
