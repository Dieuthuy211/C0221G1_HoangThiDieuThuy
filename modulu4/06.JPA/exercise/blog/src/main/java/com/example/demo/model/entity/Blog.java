package com.example.demo.model.entity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "blog")
public class Blog {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String author;
    private String content;


    public Blog() {
    }

    public Blog(long id, String author, String content) {
        this.id = id;
        this.author = author;
        this.content = content;

    }

    public Blog(String author, String content) {
        this.author = author;
        this.content = content;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
