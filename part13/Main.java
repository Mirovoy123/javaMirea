package part13;

public class Main {
    Student[] students = new Student[5];
    int[] IDNumber = new int[5];

    public Main(String s) {
        if (s.equals("demo")) {
            students[0] = new Student(4, 3.22);
            students[1] = new Student(5, 2.27);
            students[2] = new Student(3, 5);
            students[3] = new Student(1, 4.88);
            students[4] = new Student(2, 4.6);
        }
    }

    public void sortByID() {
        for (int i = 0; i < 5; i++)
            IDNumber[i] = students[i].getId();

        for (int i = 0; i < IDNumber.length - 1; i++) {
            for (int j = IDNumber.length - 1; j > i; j--) {
                if (IDNumber[j - 1] > IDNumber[j]) {
                    int tmp = IDNumber[j - 1];
                    IDNumber[j - 1] = IDNumber[j];
                    IDNumber[j] = tmp;
                }
            }
        }
        for (Student s : students) {
            System.out.printf("%4d ",s.getId());
        }
        System.out.println("");
        for (Student s : students) {
            System.out.printf("%.2f ",s.getGPA());
        }
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int[] getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(int[] IDNumber) {
        this.IDNumber = IDNumber;
    }

    public static void main(String[] args) {
        Main demo = new Main("demo");
        demo.sortByID();
    }
}