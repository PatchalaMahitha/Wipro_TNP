package collections;

import java.util.LinkedList;

public class EmployeeDBLinkedList {

    LinkedList<Employee> list = new LinkedList<>();

    public boolean addEmployee(Employee e) {
        return list.add(e);
    }

    public boolean deleteEmployee(int empId) {

        for(Employee e : list) {
            if(e.empId == empId) {
                list.remove(e);
                return true;
            }
        }

        return false;
    }

    public String showPaySlip(int empId) {

        for(Employee e : list) {
            if(e.empId == empId) {
                return "Employee Name : " + e.empName +
                        "\nSalary : " + e.salary;
            }
        }

        return "Employee Not Found";
    }

    public void display() {

        for(Employee e : list) {
            e.getEmployeeDetails();
        }
    }
}