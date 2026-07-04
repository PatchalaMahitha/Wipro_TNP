package Arrays;

public class One {
	public static void main(String[] args) {

        boolean result = true;

        for (String s : args) {
            int num = Integer.parseInt(s);

            if (num != 1 && num != 4) {
                result = false;
                break;
            }
        }

        System.out.println(result);
    }

}
