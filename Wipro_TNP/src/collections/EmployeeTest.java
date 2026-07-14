package collections;

public class EmployeeTest {

    public static void main(String[] args) {

        EmployeeDB db = new EmployeeDB();

        db.addEmployee(new Employee(101,"Mahitha","mahitha@gmail.com","Female",50000));
        db.addEmployee(new Employee(102,"Rahul","rahul@gmail.com","Male",65000));
        db.addEmployee(new Employee(103,"Kiran","kiran@gmail.com","Male",45000));

        System.out.println("Employee Details");

        db.showAllEmployees();

        System.out.println();

        System.out.println(db.showPaySlip(102));

        System.out.println();

        db.deleteEmployee(103);

        System.out.println("After Deletion");

        db.showAllEmployees();
    }
}