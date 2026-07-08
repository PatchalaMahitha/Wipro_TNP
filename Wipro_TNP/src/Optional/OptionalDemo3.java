package Optional;

import java.util.Optional;

public class OptionalDemo3 {

    public static void main(String[] args) {

        Employee emp = null;

        if (args.length == 2) {
            int id = Integer.parseInt(args[0]);
            String name = args[1];
            emp = new Employee(id, name);
        }

        try {

            Employee employee = Optional.ofNullable(emp)
                    .orElseThrow(() ->
                            new InvalidEmployeeException("Employee object is null"));

            employee.display();

        } catch (InvalidEmployeeException e) {
            System.out.println(e.getMessage());
        }

    }
}