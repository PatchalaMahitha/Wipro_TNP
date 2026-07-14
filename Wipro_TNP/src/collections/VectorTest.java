package collections;

public class VectorTest {

    public static void main(String[] args) {

        EmployeeDBVector db = new EmployeeDBVector();

        db.addEmployee(new Employee(11,"Kumar","kumar@gmail.com","Male",60000));
        db.addEmployee(new Employee(12,"Sneha","sneha@gmail.com","Female",70000));

        db.display();
    }
}