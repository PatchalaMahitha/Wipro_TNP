package exceptionhandling;

import java.util.Scanner;

public class StudentAverage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            int sum = 0;

            System.out.println("Enter marks of 3 subjects:");

            for (int i = 1; i <= 3; i++) {

                System.out.print("Subject " + i + ": ");

                int mark = Integer.parseInt(sc.nextLine());

                if (mark < 0)
                    throw new NegativeMarksException("Marks cannot be negative.");

                if (mark > 100)
                    throw new OutOfRangeException("Marks should be between 0 and 100.");

                sum += mark;
            }

            double average = sum / 3.0;

            System.out.println("Student Name : " + name);
            System.out.println("Average Marks = " + average);

        } catch (NumberFormatException e) {

            System.out.println("java.lang.NumberFormatException");

        } catch (NegativeMarksException e) {

            System.out.println(e.getMessage());

        } catch (OutOfRangeException e) {

            System.out.println(e.getMessage());

        }

        sc.close();
    }
}