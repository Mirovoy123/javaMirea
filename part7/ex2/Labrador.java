package part7.ex2;

public class Labrador extends Dog{
    public Labrador(String name, int distanceFromHome) {
        this.name = name;
        this.distanceFromHome = distanceFromHome;
    }

    @Override
    public String toString() {
        return "Labrador{" +
                "name='" + name + '\'' +
                ", distanceFromHome=" + distanceFromHome +
                '}';
    }

    private String name;
    private int distanceFromHome;

    @Override
    public void run() {
        System.out.println(this.name + " says: ok!");
        this.distanceFromHome++;
    }
}
