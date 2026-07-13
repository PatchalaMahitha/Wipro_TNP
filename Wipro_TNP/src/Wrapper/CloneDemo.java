package Wrapper;
public class CloneDemo {

    public static void main(String[] args) throws CloneNotSupportedException {

        Employee e1 = new Employee(101, "Mahitha", 50000);

        Employee e2 = (Employee) e1.clone();

        e1.setName("Naga Mahitha");

        System.out.println("Original Employee");
        e1.display();

        System.out.println();

        System.out.println("Cloned Employee");
        e2.display();
    }
}