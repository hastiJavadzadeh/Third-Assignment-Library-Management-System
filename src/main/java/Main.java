import java.util.Scanner;

public class Main {
    /*
     * make a functional library app using oop
     * run the main program in Main.java and code the oop part in other classes
     * don't forget to add at least 1 librarian to the library to make it functionable.
     * *  *** don't limit yourself to our template ***
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Library library = new Library();
        library.addLibrarian();
        runMenu(library);
    }

    public static void runMenu(Library library) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1.User\t2.Librarian\t3.exit");
            int in = input.nextInt();

            if (in == 1) {
                System.out.println("Enter username");
                String UN = input.next();
                System.out.println("Enter password");
                String pass = input.next();
                System.out.println("1.rent book\t2.return book");
                int choice = input.nextInt();
                if (choice == 1) {
                    User user = new User(UN, pass);
                    user.rentBook();
                } else if (choice == 2) {
                    User user = new User(UN, pass);
                    user.returnBook();
                } else {
                    System.out.println("Error!");
                }
            } else if (in == 2) {
                System.out.println("Enter username");
                String UN = input.next();
                System.out.println("Enter password");
                String pass = input.next();
                System.out.println("1.add book\t2.remove book\t3.update book\n4.add user\t5.remove user\t6.update user\n7.add librarian\t8.remove librarian\t9.update librarian\n10.search book\t11.search user\t12.search librarian");
                int choice = input.nextInt();
                if (choice == 1) {
                    library.addBook();
                } else if (choice == 2) {
                    library.removeBook();
                } else if (choice == 3) {
                    library.updateBook();
                } else if (choice == 4) {
                    library.addUser();
                } else if (choice == 5) {
                    library.removeUser();
                } else if (choice == 6) {
                    library.updateUser();
                } else if (choice == 7) {
                    library.addLibrarian();
                } else if (choice == 8) {
                    library.removeLibrarian();
                } else if (choice == 9) {
                    library.updateLibrarian();
                } else if (choice == 10) {
                    library.searchBook();
                } else if (choice == 11) {
                    System.out.println("Enter username.");
                    String username = input.next();
                    library.searchUser(username);
                } else if (choice == 12) {
                    System.out.println("Enter username.");
                    String username = input.next();
                    library.searchLibrarian(username);
                }
            } else if (in == 3) {
                break;
            }
        }
    }
}
