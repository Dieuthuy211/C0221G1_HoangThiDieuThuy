package com.example.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class BorrowBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer code;
    @OneToMany(mappedBy = "borrowBook")
    private List<Book> books;

    public BorrowBook() {
    }

    public BorrowBook(Integer id, Integer code, List<Book> books) {
        this.id = id;
        this.code = code;
        this.books = books;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
