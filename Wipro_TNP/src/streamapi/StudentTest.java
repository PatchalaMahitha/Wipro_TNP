package streamapi;

import java.util.ArrayList;

public class StudentTest {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1,"Rahul",80));
        students.add(new Student(2,"Suman",45));
        students.add(new Student(3,"Ravi",60));
        students.add(new Student(4,"Anil",30));
        students.add(new Student(5,"Kiran",90));

        long count = students.stream()
                .filter(s -> s.getMark() >= 50)
                .count();

        System.out.println("Students Passed : " + count);
    }
}