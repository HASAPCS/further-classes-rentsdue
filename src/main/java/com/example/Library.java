package com.example;

import java.util.List;
import java.util.ArrayList;

public class Library {
    private List<Book> bookList; //Attribute of library class

    public Library() {
        this.bookList=new ArrayList<Book>(); //Creates a new array
    }

    public void addBook(Book book) { //Book book: Class is book, variable is book
        bookList.add(book);
    }

    public void checkBook(Book book) {
        bookList.remove(book);
    }

    public Book findBookByISBN(String ISBN) {
        for(Book book: bookList) {
            if (book.getISBN().equals(ISBN)) {
                return book;
            }
        }
        return null;
    }
}
