package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101,"Rahul",25,"Pune"));
        list.add(new Employee(102,"Suman",30,"Hyderabad"));
        list.add(new Employee(103,"Ravi",28,"Pune"));
        list.add(new Employee(104,"Anil",35,"Chennai"));
        list.add(new Employee(105,"Kiran",27,"Pune"));

        List<Employee> puneEmployees = list.stream()
                .filter(e -> e.getLocation().equalsIgnoreCase("Pune"))
                .collect(Collectors.toList());

        System.out.println("Employees from Pune:");

        puneEmployees.forEach(System.out::println);
    }
}