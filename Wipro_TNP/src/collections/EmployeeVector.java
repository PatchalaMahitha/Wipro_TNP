package collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EmployeeVector {

    public static void main(String[] args) {

        Vector<Employee> vector = new Vector<>();

        vector.add(new Employee(101,"Ram","ram@gmail.com","Male",50000));
        vector.add(new Employee(102,"Sita","sita@gmail.com","Female",60000));
        vector.add(new Employee(103,"Hari","hari@gmail.com","Male",70000));

        System.out.println("Using Iterator");

        Iterator<Employee> itr = vector.iterator();

        while(itr.hasNext()) {
            itr.next().getEmployeeDetails();
        }

        System.out.println();

        System.out.println("Using Enumeration");

        Enumeration<Employee> en = vector.elements();

        while(en.hasMoreElements()) {
            en.nextElement().getEmployeeDetails();
        }
    }
}