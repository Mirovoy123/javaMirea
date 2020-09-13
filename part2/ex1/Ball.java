package part2.ex1;

public class Ball {
    private int diameter;
    private String color;

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "diameter=" + diameter +
                ", color='" + color + '\'' +
                '}';
    }
}
