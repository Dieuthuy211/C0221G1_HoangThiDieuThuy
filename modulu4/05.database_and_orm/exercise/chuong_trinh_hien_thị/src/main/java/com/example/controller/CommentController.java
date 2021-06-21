package com.example.controller;

import com.example.model.bean.Comment;
import com.example.model.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/comments")
public class CommentController {
    @Autowired
    private ICommentService commentService;

    @GetMapping(value = "/start")
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("comments/home");
        List<Comment> commentList = commentService.findAll();
        modelAndView.addObject("commentList", commentList);
        return modelAndView;
    }
    @PostMapping(value = "/create")
    public String createComment(@RequestParam Comment comment) {
        commentService.addComment(comment);
        return "redirect:/comments/start";
    }
    @PostMapping(value ="/like" )
    public String addLike(Comment comment){
        commentService.addLike(comment);;
        return "redirect:/comments/start";
    }
    @PostMapping(value = "/disLike")
    public  String addDisLike(Comment comment){
        commentService.addDislike(comment);
        return "redirect:/comments/start";
    }
}
