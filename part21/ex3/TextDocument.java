package part21.ex3;

public class TextDocument extends Document {

    public TextDocument(File file) {
        super(file);
    }

    @Override
    public String getType() {
        return "Text";
    }

}