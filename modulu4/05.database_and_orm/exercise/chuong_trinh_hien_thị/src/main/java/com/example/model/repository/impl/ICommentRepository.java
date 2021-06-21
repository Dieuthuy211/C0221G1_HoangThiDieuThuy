package com.example.model.repository.impl;

import com.example.model.bean.Comment;

import java.util.List;

public interface ICommentRepository {
    List<Comment> findAll();
    Comment findOne(int id);
    Comment addComment(Comment comment);
    void addLike(Comment comment);
    void addDislike(Comment comment);


}
