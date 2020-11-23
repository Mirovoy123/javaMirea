package part13;

import java.util.ArrayList;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.getGPA(), s2.getGPA());
    }

    public static void main(String[] args) {
        ArrayList<Student> students1 = new ArrayList<>();
        students1.add(new Student(3, 3.22));
        students1.add(new Student(2, 5));
        students1.add(new Student(1, 4.88));
        students1.add(new Student(4, 4.5));
        students1.add(new Student(0, 4.6));

        ArrayList<Student> students2 = new ArrayList<>();
        students2.add(new Student(6, 3.32));
        students2.add(new Student(7, 5));
        students2.add(new Student(8, 4.32));
        students2.add(new Student(9, 3.32));
        students2.add(new Student(5, 4.26));

        students1.addAll(students2);

        students1.sort(new SortingStudentsByGPA());

        for (Student s : students1) {
            System.out.printf("%4d ",s.getId());
        }
        System.out.println("");
        for (Student s : students1) {
            System.out.printf("%.2f ",s.getGPA());
        }
    }

}