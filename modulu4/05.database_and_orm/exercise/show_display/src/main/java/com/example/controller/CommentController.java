package com.example.controller;

import com.example.model.entity.Comment;
import com.example.model.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = {"/comments", "/"})
public class CommentController {
    @Autowired
    private ICommentService commentService;

    @GetMapping(value = "/")
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("home");
        List<Comment> commentList = commentService.findAll();
        modelAndView.addObject("commentList", commentList);
        return modelAndView;
    }

    @GetMapping(value = "/create")
    public String createComment(Comment comment) {
        commentService.addComment(comment);
        return "redirect:/comments/";
    }

    @GetMapping(value = "/like/{id}")
    public String addLike(@PathVariable int id) {
        Comment comment = commentService.findOne(id);
        comment.setLikes(comment.getLikes()+1);
        commentService.addLike(comment);
        return "redirect:/comments/";
    }
//    @PostMapping(value = "/disLike")
//    public  String addDisLike(Comment comment){
//        commentService.addDislike(comment);
//        return "redirect:/comments/start";
//    }
}
