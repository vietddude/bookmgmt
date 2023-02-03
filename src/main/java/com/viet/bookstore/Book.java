package com.viet.bookstore;

public class Book {
    protected int id;
    protected  String title;
    protected String author;
    protected float price;

    public Book() {}

    public Book(int id) {
        this.id = id;
    }

    public Book(String title, String author, float price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book(int id, String title, String author, float price) {
        this(title, author, price);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public float getPrice() {
        return price;
    }

}
