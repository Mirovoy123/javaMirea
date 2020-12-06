package part21.ex1;

public class ComplexFactory implements ComplexAbstractFactory {

    @Override
    public Complex create(double real, double img) {
        return new Complex(real, img);
    }

}