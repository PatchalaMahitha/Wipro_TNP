package functionalinterface;

import java.util.*;
import java.util.function.Predicate;

public class EmployeeSalaryFilter {

    public static void main(String[] args) {

        ArrayList<Employee> list=new ArrayList<>();

        list.add(new Employee(1,"Rahul","Pune",9000));
        list.add(new Employee(2,"Ravi","Delhi",12000));
        list.add(new Employee(3,"Anil","Pune",8000));
        list.add(new Employee(4,"Suman","Hyd",25000));
        list.add(new Employee(5,"Kiran","Chennai",7000));

        Predicate<Employee> p=e->e.getSalary()<10000;

        list.stream()
                .filter(p)
                .forEach(e->System.out.println(e.getName()));
    }
}