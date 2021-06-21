package com.example.model.service;

import com.example.model.entity.Comment;

import java.util.List;

public interface ICommentService {
    List<Comment> findAll();
    Comment findOne(int id);
    void addComment(Comment comment);
    void addLike(Comment comment);
//    void addDislike(Comment comment);
}
