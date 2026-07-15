package functionalinterface;

import java.util.*;
import java.util.function.Function;

public class EmployeeLocation {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101,"Rahul","Hyderabad",35000));
        list.add(new Employee(102,"Ravi","Pune",45000));
        list.add(new Employee(103,"Anil","Chennai",55000));
        list.add(new Employee(104,"Suman","Delhi",25000));
        list.add(new Employee(105,"Kiran","Bangalore",60000));

        Function<Employee,String> fun = Employee::getLocation;

        ArrayList<String> locations = new ArrayList<>();

        for(Employee e:list)
            locations.add(fun.apply(e));

        System.out.println(locations);
    }
}