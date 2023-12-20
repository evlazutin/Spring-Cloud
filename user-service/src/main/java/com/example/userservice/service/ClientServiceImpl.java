package com.example.userservice.service;

import com.example.userservice.connector.BookServiceConnector;
import com.example.userservice.model.Book;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements ClientService{

    private final BookServiceConnector bookServiceConnector;

    @Override
    public List<Book> getAllBooks() {
        return bookServiceConnector.getAllBooks();

    }

}
