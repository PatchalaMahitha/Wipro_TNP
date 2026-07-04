package Arrays;

public class SearchElement {
	public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Please enter one integer.");
            return;
        }

        int search = Integer.parseInt(args[0]);

        int arr[] = {1, 4, 34, 56, 7};

        int index = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == search) {
                index = i;
                break;
            }
        }

        System.out.println(index);
    }

}
