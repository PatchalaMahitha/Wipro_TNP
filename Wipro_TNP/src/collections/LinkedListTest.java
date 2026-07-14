package collections;

public class LinkedListTest {

    public static void main(String[] args) {

        EmployeeDBLinkedList db = new EmployeeDBLinkedList();

        db.addEmployee(new Employee(1,"Asha","asha@gmail.com","Female",45000));
        db.addEmployee(new Employee(2,"Ravi","ravi@gmail.com","Male",52000));

        db.display();

        System.out.println(db.showPaySlip(1));
    }
}