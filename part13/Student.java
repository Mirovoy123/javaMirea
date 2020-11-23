package part13;

public class Student {
    private int id;
    private double GPA;

    public Student(int id, double GPA) {
        this.id = id;
        this.GPA = GPA;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}