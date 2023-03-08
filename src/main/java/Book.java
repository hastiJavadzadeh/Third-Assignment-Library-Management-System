import java.util.Scanner;

public class Book {
    private String bookName;
    private String authorName;
    private int yearOfPublish;
    private String ISBN;
    private int quantityOfBook;

    Scanner input = new Scanner(System.in);

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    public void setYearOfPublish(int yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getQuantityOfBook() {
        return quantityOfBook;
    }

    public void setQuantityOfBook(int quantityOfBook) {
        this.quantityOfBook = quantityOfBook;
    }

    public Book(String bookName, String authorName, int yearOfPublish, String ISBN){
        this.bookName=bookName;
        this.authorName=authorName;
        this.yearOfPublish=yearOfPublish;
        this.ISBN=ISBN;
    }
    //Book should contain name,author,year of publish and ISBN
}
