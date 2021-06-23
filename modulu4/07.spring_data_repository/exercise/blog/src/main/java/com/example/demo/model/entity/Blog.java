package com.example.demo.model.entity;

import javax.persistence.*;

@Entity(name = "blog")
public class Blog {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String author;
    private String content;
@ManyToOne
@JoinColumn(name = "category_id",referencedColumnName = "id")
private Category category;

    public Blog() {
    }




    public Blog(String author, String content) {
        this.author = author;
        this.content = content;

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
