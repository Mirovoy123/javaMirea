package part7.ex2;

public class Pug extends Dog{
    public Pug(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pug{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private final String name;
    private final int age;
    @Override
    public void run() {
        System.out.println(this.name + " says: no");
    }
}
