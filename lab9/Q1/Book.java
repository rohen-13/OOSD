package Q1;

public class Book extends LibraryItem implements LoanItem {
    String author;
    String title;
    int numPages;

    public Book(String ID, String author, String title, int numPages) {
        super("Q1.Book", ID);
        this.author = author;
        this.title = title;
        this.numPages = numPages;
    }

    @Override
    public double calculatePrice() {
        return numPages * 0.01;
    }
}