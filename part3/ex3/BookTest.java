package part3.ex3;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();
        book.setAmountOfPages(1247);
        book.setAuthor("Л.Н.Толстой");
        book.setTitle("Война и мир");
        book.setDateOfPublishment(1867);
        System.out.println(book);
    }
}
