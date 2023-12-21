package com.example.bookservice.controller;

import com.example.bookservice.model.Book;
import com.example.bookservice.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/books")
//@AllArgsConstructor
public class BookRestController {

    @Value("${eureka.instance.instance-id}")
    private String lb;

    public BookRestController(BookService bookService) {
        this.bookService = bookService;
    }

    private final BookService bookService;

    @GetMapping
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("/lb")
    public String getLb(){
        return lb;
    }

}
