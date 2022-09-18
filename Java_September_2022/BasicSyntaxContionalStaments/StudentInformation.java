package ProblemSolving;

import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

        // the name of the student
        String name = scan.nextLine();

        // the age of the student
        int age = Integer.parseInt(scan.nextLine());

        // student grade floating point
        double grade = Double.parseDouble(scan.nextLine());

        System.out.printf("Name: %s, Age: %d, Grade: %.2f",name, age, grade);

    }
}
