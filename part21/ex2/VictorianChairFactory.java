package part21.ex2;

public class VictorianChairFactory implements AbstractChairFactory {

    @Override
    public VictorianChair create() {
        return new VictorianChair();
    }

}