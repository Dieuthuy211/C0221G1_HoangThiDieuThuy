package com.example.model.bean;

import javax.persistence.*;


@Entity
@Table
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int mark;
    private String author;
    private String feedback;
    private int like;


    public Comment() {
    }

    public Comment(int id, int mark, String author, String feedback, int like) {
        this.id = id;
        this.mark = mark;
        this.author = author;
        this.feedback = feedback;
        this.like = like;
    }

    public Comment(int mark, String author, String feedback, int like) {
        this.mark = mark;
        this.author = author;
        this.feedback = feedback;
        this.like = like;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
