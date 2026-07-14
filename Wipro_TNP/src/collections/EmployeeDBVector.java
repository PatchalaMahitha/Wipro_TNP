package collections;

import java.util.Vector;

public class EmployeeDBVector {

    Vector<Employee> list = new Vector<>();

    public boolean addEmployee(Employee e) {
        return list.add(e);
    }

    public void display() {

        for(Employee e : list) {
            e.getEmployeeDetails();
        }
    }
}