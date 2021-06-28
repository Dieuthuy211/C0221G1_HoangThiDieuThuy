package com.example.model.entity;

import javax.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;
    private String name;
    private String category;
    private int amount;
    @ManyToOne
    @JoinColumn(name = "borrow_Book_id",referencedColumnName = "id")
    private  BorrowBook borrowBook;

    public Book() {
    }

    public Book(Integer id, String name, String category, int amount, BorrowBook borrowBook) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.amount = amount;
        this.borrowBook = borrowBook;
    }

    public Book(String name, String category, int amount, BorrowBook borrowBook) {
        this.name = name;
        this.category = category;
        this.amount = amount;
        this.borrowBook = borrowBook;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public BorrowBook getBorrowBook() {
        return borrowBook;
    }

    public void setBorrowBook(BorrowBook borrowBook) {
        this.borrowBook = borrowBook;
    }
}
