package part19.ex2;

import part13.Student;
import part13.SortingStudentsByGPA;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Student find(ArrayList<Student> students, double GPA){
        for (Student e : students) {
            if (e.getGPA() == GPA) return e;
        }
        throw new ElementNotFoundException();
    }
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(3, 3.22));
        students.add(new Student(2, 5));
        students.add(new Student(1, 4.88));
        students.add(new Student(4, 4.5));
        students.add(new Student(0, 4.6));

        students.sort(new SortingStudentsByGPA());

        for (Student s : students) {
            System.out.printf("%4d ",s.getId());
        }
        System.out.println();
        for (Student s : students) {
            System.out.printf("%.2f ",s.getGPA());
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("\nВведите оценку искомого студента.");
        double GPA = sc.nextDouble();
        try {
            Student student = find(students, GPA);
            System.out.printf("Номер студента с оценкой %.2f: %d.\n", GPA, student.getId());
        } catch (ElementNotFoundException e) {
            System.out.printf("Студента с оценкой %.2f нет.", GPA);
        }
    }
}