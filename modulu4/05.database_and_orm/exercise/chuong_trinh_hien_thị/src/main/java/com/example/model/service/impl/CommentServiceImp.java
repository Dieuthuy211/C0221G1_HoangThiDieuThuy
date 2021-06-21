package com.example.model.service.impl;

import com.example.model.bean.Comment;
import com.example.model.repository.impl.CommentRepositoryImpl;
import com.example.model.repository.impl.ICommentRepository;
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
    public Comment addComment(Comment comment) {
        return commentRepository.addComment(comment);
    }

    @Override
    public void addLike(Comment comment) {
        commentRepository.addLike(comment);
    }

    @Override
    public void addDislike(Comment comment) {
        commentRepository.addDislike(comment);
    }

}
