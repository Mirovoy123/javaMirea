package part7.ex1;

public class Cup extends Dish {
    @Override
    public String toString() {
        return "Cup{" +
                "isTransparent=" + isTransparent +
                ", hasHandle=" + hasHandle +
                '}';
    }

    private final boolean isTransparent;
    private final boolean hasHandle;
    public Cup(boolean isTransparent,boolean hasHandle) {
        this.isTransparent=isTransparent;
        this.hasHandle=hasHandle;
    }
    @Override
    public void Break() {
        System.out.println("im broke");
    }
}

