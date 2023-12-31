package com.example.userservice.controller;

import com.example.userservice.model.Book;
import com.example.userservice.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/client")
public class ServiceBookController {

private final ClientService clientService;

    @GetMapping("/books")
    public List<Book> getAllBooks(){
       return clientService.getAllBooks();
    }

}
