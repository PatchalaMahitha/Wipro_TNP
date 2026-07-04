package Arrays;

public class Sum {
	public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please pass array elements.");
            return;
        }

        int sum = 0;
        boolean ignore = false;

        for (String s : args) {

            int num = Integer.parseInt(s);

            if (num == 6)
                ignore = true;

            if (!ignore)
                sum += num;

            if (ignore && num == 7)
                ignore = false;
        }

        System.out.println(sum);
    }


}
