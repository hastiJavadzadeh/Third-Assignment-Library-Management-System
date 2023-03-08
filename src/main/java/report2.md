# Library Management System
## Introduction
In this assignment, we built a simple java program that manages a library which we can search books or add and remove them using it.
## Design and Implemention
There were different classes that needed to be completed.I started with Book class and added variables bookName, authorName, ISBN, year of publish and quantity to it.

User and librarian classes, needed username and password.

In library class, I created three lists for books, users and librarians.There are different methods in this class; such as addBook.This method, takes a book's information(like name, ISBN, etc) as input and adds it to books list.RemoveBook method takes the same information and removes that book. SearchBook, takes book's ISBN and if that book exists in books list returns its information.And updateBook method, changes book's data.

There are same methods for users and librarians such as addUser or updateLibrarian which do same things as book related methods.

In main class, there is a runMenu function that displays the menu for the user.If you log in as a librarian, you can use different features like adding books,removing books, searching librarians, etc.

As an ordinary user, you can borrow or return books.

## Testing and Evaluation
At first, I had forgotten to pass a Library type variable to runMenu function, so the methods couldn't work properly.Then I passed library of type Library to it.I fixed some other problems, too.
However, I'm not sure if all the outputs are correct now...I hope so:)

## Conclusion
This assignment helped me to learn how to use OOP.