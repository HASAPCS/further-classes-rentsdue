package com.example;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean checkedOut;

    public Book(String title, String author, String ISBN) {
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
        this.checkedOut=checkedOut;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getISBN() {
        return this.ISBN;
    }

    public boolean isCheckedOut() {
        return this.checkedOut;
    }

    public void setTitle() {
        this.title=title;
    }

    // TODO: Implement getters, setters, and any other methods you find necessary
}
