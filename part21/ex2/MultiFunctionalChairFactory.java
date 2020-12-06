package part21.ex2;

public class MultiFunctionalChairFactory implements AbstractChairFactory {

    @Override
    public MultiFunctionalChair create() {
        return new MultiFunctionalChair();
    }

}