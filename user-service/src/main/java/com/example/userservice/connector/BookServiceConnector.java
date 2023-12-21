package com.example.userservice.connector;

import com.example.userservice.model.Book;
import feign.Feign;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collections;
import java.util.List;

@FeignClient(name = "book-service")
@CircuitBreaker(name = "book-service", fallbackMethod = "fallback")
public interface BookServiceConnector {

    @GetMapping("/api/books")
    List<Book> getAllBooks();

    default List<Book> fallback(Throwable ex) {
        final Logger log = LogManager.getLogger(Feign.class);
        log.info(ex.getMessage());
        return Collections.emptyList();
    }
}