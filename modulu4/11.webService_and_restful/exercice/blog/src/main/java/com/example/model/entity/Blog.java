package com.example.model.entity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "blog")
public class Blog {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String author;
    private String content;
    private Date timeCreate =new Date();
@ManyToOne
@JoinColumn(name = "category_id",referencedColumnName = "id")
private Category category;

    public Blog(String author, String content, Date timeCreate, Category category) {
        this.author = author;
        this.content = content;
        this.timeCreate = timeCreate;
        this.category = category;
    }

    public Blog(Integer id, String author, String content, Date timeCreate, Category category) {
        this.id = id;
        this.author = author;
        this.content = content;
        this.timeCreate = timeCreate;
        this.category = category;
    }

    public Blog() {

    }

    public Date getTimeCreate() {
        return timeCreate;
    }

    public void setTimeCreate(Date time) {
        this.timeCreate = time;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
