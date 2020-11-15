package part7.ex3;

public class Chair extends Furniture {
    private final int numberOfLegs;
    private final int price;
    private final String material;
    private final String type;

    public Chair(int numberOfLegs, int price, String material, String type) {
        this.numberOfLegs = numberOfLegs;
        this.price = price;
        this.material = material;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "numberOfLegs=" + numberOfLegs +
                ", price=" + price +
                ", material='" + material + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public void build() {
        System.out.println("ez");
    }
}
