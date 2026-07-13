package employee;

import java.io.*;
import java.util.*;

public class EmployeeManagementSystem {

    static final String FILE_NAME = "Employee.txt";

    public static void addEmployee(Scanner sc) {

        try {
            FileWriter fw = new FileWriter(FILE_NAME, true);
            PrintWriter pw = new PrintWriter(fw);

            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Employee Age: ");
            int age = sc.nextInt();

            System.out.print("Enter Employee Salary: ");
            double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, age, salary);

            pw.println(emp);

            pw.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void displayAll() {

        try {

            File file = new File(FILE_NAME);

            if (!file.exists()) {
                System.out.println("No employee records found.");
                return;
            }

            BufferedReader br = new BufferedReader(new FileReader(file));

            System.out.println("-----Report-----");

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            System.out.println("-----End of Report-----");

            br.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\nMain Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addEmployee(sc);
                    break;

                case 2:
                    displayAll();
                    break;

                case 3:
                    System.out.println("Exiting the System");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}