package Arrays;
import java.util.LinkedHashSet;


public class Duplicate {
	public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please pass array elements.");
            return;
        }

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (String s : args) {
            set.add(Integer.parseInt(s));
        }

        System.out.print("{");
        int count = 0;
        for (int num : set) {
            System.out.print(num);
            count++;
            if (count < set.size())
                System.out.print(",");
        }
        System.out.println("}");
    }

}
