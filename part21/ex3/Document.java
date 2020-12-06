package part21.ex3;

public abstract class Document {

    private File file;

    public Document(File file) {
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void save() {
        this.file = File.SAVE;
    }

    public void exit(){
        this.file = File.EXIT;
    }

    public abstract String getType();
}