package part21.ex3;

public class MusicDocument extends Document {

    public MusicDocument(File file) {
        super(file);
    }

    @Override
    public String getType() {
        return "Music";
    }

}