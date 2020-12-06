package part21.ex2;

public class MagicChairFactory implements AbstractChairFactory {

    @Override
    public MagicChair create() {
        return new MagicChair();
    }

}