package part21.ex3;

public class MusicDocumentFactory implements AbstractDocumentFactory {

    @Override
    public Document create() {
        return new MusicDocument(File.NEW);
    }

    @Override
    public Document open() {
        return new MusicDocument(File.OPEN);
    }
}