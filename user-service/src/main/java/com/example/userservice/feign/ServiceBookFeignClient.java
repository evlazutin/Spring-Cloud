package com.example.userservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "book-service")
public interface ServiceBookFeignClient {

    @GetMapping("/api/books")
    String getAllBooks();

}
