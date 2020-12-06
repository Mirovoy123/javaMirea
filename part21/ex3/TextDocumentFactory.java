package part21.ex3;

public class TextDocumentFactory implements AbstractDocumentFactory {

    @Override
    public Document create() {
        return new TextDocument(File.NEW);
    }

    @Override
    public Document open() {
        return new TextDocument(File.OPEN);
    }
}