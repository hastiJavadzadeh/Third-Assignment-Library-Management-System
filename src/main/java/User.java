import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class User {
    //User should have a list of books
    //User should have a username and a password
    private String username;
    private String password;
    Scanner input = new Scanner(System.in);

    ArrayList<Book> useresBooks = new ArrayList<>();
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void rentBook(){
        Library listOfBooks = new Library();
        System.out.println("Enter book's information: Name, Author, Year of publish, ISBN.");
        String bookName = input.next();
        String authorName = input.next();
        int YOP = input.nextInt();
        String ISBN = input.next();
        Book newBook = new Book(bookName, authorName, YOP, ISBN);
        useresBooks.add(newBook);
    }

    public void returnBook(){
        System.out.println("Enter book's information: Name, Author, Year of publish, ISBN.");
        String bookName = input.next();
        String authorName = input.next();
        int YOP = input.nextInt();
        String ISBN = input.next();
        Book removeBook = new Book(bookName, authorName, YOP, ISBN);
        for (int i = 0; i < useresBooks.size();i++) {
            if (ISBN.equals(useresBooks.get(i).getISBN())){
                useresBooks.remove(removeBook);
            }
        }
    }

    public User(String username, String password) {
        this.username=username;
        this.password=password;
    }
}
