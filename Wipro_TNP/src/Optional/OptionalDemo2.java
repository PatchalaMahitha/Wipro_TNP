package Optional;

import java.util.Optional;

public class OptionalDemo2 {

    public static void main(String[] args) {

        String address = null;

        if (args.length > 0) {
            address = args[0];
        }

        String result = Optional.ofNullable(address).orElse("India");

        System.out.println("Address : " + result);
    }
}