package part21.ex3;

public class DocumentFactoryProvider {

    public static AbstractDocumentFactory getFactory(String type) {
        if (type.equals("Image")) {
            return new ImageDocumentFactory();
        }
        if (type.equals("Music")) {
            return new MusicDocumentFactory();
        }
        if (type.equals("Text")) {
            return new TextDocumentFactory();
        }
        return null;
    }

}