package part14;

public class Student implements Main {
    private final int id;
    private final double GPA;

    public Student(int id, double GPA) {
        this.id = id;
        this.GPA = GPA;
    }

    public double getGPA() {
        return GPA;
    }

    public static void binarySearch(Main[] test, int first, int last, double item) {
        int pos = (first + last) / 2;

        while ((test[pos].getGPA()!=item) && (first <= last)) {
            if (test[pos].getGPA() > item)
                last = pos - 1;
            else
                first = pos + 1;
            pos = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println("Бинарный поиск: "+ item + " является " + ++pos + " элементом в массиве");
        } else {
            System.out.println("Элемент не найден");
        }
    }

    public boolean equals(Object o) {
        return  o == this;
    }

    public static void lineSearch(Main[] test, int item) {
        for (int i = 0; i < 5; i++) {
            if (test[i].getGPA() == item) {
                System.out.println("Линейный поиск: "+ item +" является "+ (i+1) +" элементом в массиве ");
                break;
            }
        }
    }

    public static void main(String[] args) {

        Main[] test = new Student[5];
        test[0] = new Student(1, 3.45);
        test[1] = new Student(2, 3.5);
        test[2] = new Student(3, 4.5);
        test[3] = new Student(4, 4.55);
        test[4] = new Student(5, 5);

        binarySearch(test, 1, 5, 5);
        lineSearch(test, 5);

    }
}