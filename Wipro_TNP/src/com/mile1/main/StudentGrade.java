package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentGrade {

    public static void validate(Student s)
            throws NullStudentObjectException,
                   NullNameException,
                   NullMarksArrayException {

        if (s == null) {
            throw new NullStudentObjectException();
        }

        if (s.getName() == null) {
            throw new NullNameException();
        }

        if (s.getMarks() == null) {
            throw new NullMarksArrayException();
        }

        int sum = 0;
        for (int mark : s.getMarks()) {
            sum += mark;
        }

        double avg = (double) sum / s.getMarks().length;

        String grade;

        if (avg >= 80)
            grade = "A";
        else if (avg >= 60)
            grade = "B";
        else if (avg >= 40)
            grade = "C";
        else
            grade = "F";

        s.setGrade(grade);

        System.out.println("Student Name : " + s.getName());
        System.out.println("Average      : " + avg);
        System.out.println("Grade        : " + s.getGrade());
    }

    public static void main(String[] args) {

        Student s1 = new Student("",
                new int[] {85, 90, 80},
                "Rahul");

        Student s2 = new Student("",
                null,
                "Suman");

        Student s3 = new Student("",
                new int[] {75, 80, 85},
                null);

        Student s4 = null;

        Student[] students = { s1, s2, s3, s4 };

        for (Student s : students) {

            try {
                validate(s);
            }
            catch (Exception e) {
                System.out.println(e);
            }

            System.out.println("----------------------------");
        }
    }
}