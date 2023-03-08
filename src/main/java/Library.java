import java.util.*;
public class Library {
    /*
    * The library should have a list of books.
    * The library should have a map of books ISBNs which is linked to the amount of book
    -> (for example: harry potter -> 4 means there are currently 4 harry potter books)
    * The library should have a list of users and a list of librarians.
     */

    //book related functions
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();
    ArrayList<Librarian> librarians = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void addBook(){
        System.out.println("Enter book's information: Name, Author, Year of publish, ISBN.");
        String bookName = input.next();
        String authorName = input.next();
        int YOP = input.nextInt();
        String ISBN = input.next();
        Book newBook = new Book(bookName, authorName, YOP, ISBN);
        for (int i = 0; i < books.size(); i++) {
            if (newBook.equals(books.get(i))) {
                System.out.println("This book already exists.");
                return;
            }
        }
        books.add(newBook);
    }

    public void removeBook(){
        System.out.println("Enter book's information: Name, Author, Year of publish, ISBN.");
        String bookName = input.next();
        String authorName = input.next();
        int YOP = input.nextInt();
        String ISBN = input.next();
        Book removedBook = new Book(bookName, authorName, YOP, ISBN);
        for (int i = 0; i < books.size(); i++) {
            if (removedBook.equals(books.get(i))) {
                books.remove(removedBook);
                return;
            }
        }
        System.out.println("This book doesn't exist.");
    }

    public void searchBook(){ //search by isbn
        System.out.println("Enter ISBN of the book");
        String ISBN = input.next();
        for (int i = 0; i < books.size(); i++) {
            if (ISBN.equals(books.get(i).getISBN())) {
                System.out.println("Name: " + books.get(i).getBookName() + "\n" + "Author: " + books.get(i).getAuthorName() + "\n" + "Year of publish: " + books.get(i).getYearOfPublish());
                return;
            }
        }
        System.out.println("This book is not available");
    }

    public void updateBook(){
        System.out.println("Enter the ISBN of the book you want to be updated.");
        String ISBN = input.nextLine();
        System.out.println("Enter new book name, author name, year of publish for the book.");
        String updatedName = input.nextLine();
        String updatedAuthor = input.nextLine();
        int updatedYOP = input.nextInt();
        for(int i = 0; i < books.size(); i++) {
            if(ISBN.equals(books.get(i).getISBN())) {
                books.get(i).setBookName(updatedName);
                books.get(i).setAuthorName(updatedAuthor);
                books.get(i).setYearOfPublish(updatedYOP);
            }
        }
    }

    public void doesBookExist(String ISBN){
        System.out.println("Enter book's ISBN.");
        for (int i = 0; i < books.size(); i++) {
            if (ISBN.equals(books.get(i).getISBN())) {
                System.out.println("Available!");
                return;
            }
        }
        System.out.println("Not available!");
    }

    public void increaseBook(String ISBN){
        System.out.println("Enter the ISBN of the book.");
        System.out.println("Enter number of books to be added.");
        int increasedN = input.nextInt();
        for (int i = 0; i < books.size(); i++) {
            if (ISBN.equals(books.get(i).getISBN())) {
                books.get(i).setQuantityOfBook( books.get(i).getQuantityOfBook()+increasedN);
            }
        }
    }

    public void decreaseBook(String ISBN){
        System.out.println("Enter the ISBN of the book.");
        System.out.println("Enter number of books to be removed.");
        int decreasedN = input.nextInt();
        for (int i = 0; i < books.size(); i++) {
            if (ISBN.equals(books.get(i).getISBN())) {
                books.get(i).setQuantityOfBook( books.get(i).getQuantityOfBook()+decreasedN);
            }
        }
    }

    //user related functions

    public void addUser(){

        System.out.println("Enter username");
        String UN = input.next();
        System.out.println("Enter password");
        String pass = input.next();
        User newUser = new User(UN, pass);
        for (int i = 0; i < users.size(); i++) {
            if (newUser.equals(users.get(i))) {
                System.out.println("This user already exists.");
                return;
            }
        }
        users.add(newUser);
        //TODO
    }

    public void removeUser(){
        System.out.println("Enter username");
        String UN = input.next();
        System.out.println("Enter password");
        String pass = input.next();
        User removedUser = new User(UN, pass);
        for (int i = 0; i < users.size(); i++) {
            if (removedUser.equals(users.get(i))) {
                users.remove(removedUser);
                return;
            }
        }
        System.out.println("This user doesn't exist.");
    }

    public void searchUser(String username){
        for (int i = 0; i < users.size(); i++) {
            if (username.equals(users.get(i).getUsername())) {
                System.out.println(users.get(i).getUsername());
                System.out.println(users.get(i).getPassword());
                return;
            }
        }
        System.out.println("This user doesn't exist.");
    }

    public void updateUser(){
        System.out.println("Enter the username of the user you want to be updated.");
        String username = input.nextLine();
        System.out.println("Enter new username and password");
        String updatedUName = input.nextLine();
        String updatedPass = input.nextLine();
        for(int i = 0; i < users.size(); i++) {
            if(username.equals(users.get(i).getUsername())) {
                users.get(i).setUsername(updatedUName);
                users.get(i).setPassword(updatedPass);
            }
        }
    }

    public void doesUserExist(String username){
        System.out.println("Enter username.");

        for (int i = 0; i < users.size(); i++) {
            if (username.equals(users.get(i).getUsername())) {
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
        //TODO
    }

    //librarian related functions

    public void addLibrarian(){
        System.out.println("Enter username for new librarian");
        String UN = input.next();
        System.out.println("Enter password for new librarian");
        String pass = input.next();
        Librarian newLibrarian = new Librarian(UN, pass);
        for (int i = 0; i < librarians.size(); i++) {
            if (newLibrarian.equals(librarians.get(i))) {
                System.out.println("This librarian already exists.");
                return;
            }
        }
        librarians.add(newLibrarian);
        //TODO
    }

    public void removeLibrarian(){
        System.out.println("Enter username");
        String UN = input.next();
        System.out.println("Enter password");
        String pass = input.next();
        Librarian removedLibrarian = new Librarian(UN, pass);
        for (int i = 0; i < librarians.size(); i++) {
            if (removedLibrarian.equals(librarians.get(i))) {
                librarians.remove(removedLibrarian);
                return;
            }
        }
        System.out.println("This librarian doesn't exist.");
        //TODO
    }

    public void searchLibrarian(String username){

        for (int i = 0; i < librarians.size(); i++) {
            if (username.equals(librarians.get(i).getUsername())) {
                System.out.println(librarians.get(i).getUsername());
                System.out.println(librarians.get(i).getPassword());
                return;
            }
        }
        System.out.println("This librarian doesn't exist.");
    }

    public void updateLibrarian(){
        System.out.println("Enter the username of the librarian you want to be updated.");
        String username = input.nextLine();
        System.out.println("Enter new username and password");
        String updatedUName = input.nextLine();
        String updatedPass = input.nextLine();
        for(int i = 0; i < librarians.size(); i++) {
            if(username.equals(librarians.get(i).getUsername())) {
                librarians.get(i).setUsername(updatedUName);
                librarians.get(i).setPassword(updatedPass);
            }
        }
    }

    public void doesLibrarianExist(String username){
        System.out.println("Enter username.");

        for (int i = 0; i < librarians.size(); i++) {
            if (username.equals(librarians.get(i).getUsername())) {
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
    }
}
