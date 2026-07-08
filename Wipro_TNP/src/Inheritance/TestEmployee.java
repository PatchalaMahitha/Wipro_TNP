package Inheritance;

public class TestEmployee {

    public static void main(String[] args) {

        if (args.length != 4) {
            System.out.println("Please enter 4 arguments");
            return;
        }

        String name = args[0];
        double salary = Double.parseDouble(args[1]);
        int year = Integer.parseInt(args[2]);
        String insurance = args[3];

        Employee emp = new Employee(name, salary, year, insurance);

        System.out.println("Employee Details");
        System.out.println("----------------");
        System.out.println("Name : " + emp.getName());
        System.out.println("Annual Salary : " + emp.getAnnualSalary());
        System.out.println("Year Started : " + emp.getYearStarted());
        System.out.println("Insurance Number : " + emp.getInsuranceNumber());
    }
}