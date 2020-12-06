package part21.ex3;

public class ImageDocument extends Document {

    public ImageDocument(File file) {
        super(file);
    }

    @Override
    public String getType() {
        return "Image";
    }

}