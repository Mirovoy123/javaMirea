package part3.ex3;

public class Book {
    public int getDateOfPublishment() {
        return dateOfPublishment;
    }

    public void setDateOfPublishment(int dateOfPublishment) {
        this.dateOfPublishment = dateOfPublishment;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public void setAmountOfPages(int amountOfPages) {
        this.amountOfPages = amountOfPages;
    }

    private int dateOfPublishment;
    private String author;
    private String title;
    private int amountOfPages;

    @Override
    public String toString() {
        return  "Дата публикации: " + dateOfPublishment +
                ", Автор: " + author +
                ", Название: \"" + title + '\"' +
                ", Количество страниц: " + amountOfPages + ".";
    }
}
