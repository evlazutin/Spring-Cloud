package com.example.bookservice.service;

import com.example.bookservice.model.Book;
import com.example.bookservice.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService{

    private final BookRepository bookRepository;

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

}
