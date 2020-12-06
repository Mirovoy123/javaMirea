package part21.ex3;

public class ImageDocumentFactory implements AbstractDocumentFactory {

    @Override
    public Document create() {
        return new ImageDocument(File.NEW);
    }

    @Override
    public Document open() {
        return new ImageDocument(File.OPEN);
    }
}