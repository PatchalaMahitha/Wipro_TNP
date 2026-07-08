package Optional;

import java.util.Optional;

public class OptionalDemo1 {

    public static void main(String[] args) {

        String names[] = new String[5];

        Optional<String> name = Optional.ofNullable(names[0]);

        if (name.isPresent()) {
            System.out.println("Length = " + name.get().length());
        } else {
            System.out.println("Value is null");
        }
    }
}