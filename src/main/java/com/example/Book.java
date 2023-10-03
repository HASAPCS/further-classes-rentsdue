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
        this.checkedOut=false;
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

    public void setTitle(String newTitle) {
        this.title=newTitle;
    }

    public void setAuthor(String newAuthor) {
        this.author=newAuthor;
    }

    public void setISBN(String newISBN) {
        this.ISBN=newISBN;
    }

    public void setCheckedOut(boolean newCheckedOut) {
        this.checkedOut=newCheckedOut;
    }
}