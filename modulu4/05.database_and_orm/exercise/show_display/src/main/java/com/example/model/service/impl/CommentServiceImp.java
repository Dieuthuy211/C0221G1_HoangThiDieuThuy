package com.example.model.service.impl;

import com.example.model.entity.Comment;
import com.example.model.repository.CommentRepositoryImpl;
import com.example.model.repository.ICommentRepository;
import com.example.model.service.ICommentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImp implements ICommentService {
    ICommentRepository commentRepository = new CommentRepositoryImpl();

    @Override
    public List<Comment> findAll() {
        return commentRepository.findAll();
    }

    @Override
    public Comment findOne(int id) {
        return commentRepository.findOne(id);
    }

    @Override
    public void addComment(Comment comment) {
        commentRepository.addComment(comment);
    }

    @Override
    public void addLike(Comment comment) {
        commentRepository.addLike(comment);
    }

//    @Override
//    public void addDislike(Comment comment) {
//        commentRepository.addDislike(comment);
//    }

}
