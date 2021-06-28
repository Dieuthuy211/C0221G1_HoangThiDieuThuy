package com.example.controller;

import com.example.exception.BookException;
import com.example.model.entity.Book;
import com.example.model.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    IBookService bookService;

    @GetMapping(value = "/books")
    public String showBooks(Model model) {
        List<Book> books = bookService.findAll();
        model.addAttribute("books", books);
        return "list";
    }

    @GetMapping("/borrow/{id}")
    public String borrowBook(@PathVariable("id") Integer id) throws BookException {
        Book book = bookService.findById(id);
        if (book == null) {
            throw new BookException();
        }
        book.setAmount(book.getAmount() - 1);
        if (book.getAmount() < 0) {
            throw new BookException();
        }
        bookService.save(book);
        return "redirect:/books";
    }
    @GetMapping("/pay/{id}")
    public String payBook(@PathVariable("id") Integer id) throws BookException {
        Book book = bookService.findById(id);
        if (book == null) {
            throw new BookException();
        }
        book.setAmount(book.getAmount() + 1);
        bookService.save(book);
        return "redirect:/books";
    }
@ExceptionHandler(BookException.class)
    public String handlerBook(){
        return "error.404";
}

}
