package com.example.userservice.controller;

import com.example.userservice.feign.ServiceBookFeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user-service")
public class ServiceBookController {

private final ServiceBookFeignClient serviceBookFeignClient;

    public ServiceBookController(ServiceBookFeignClient serviceBookFeignClient) {
        this.serviceBookFeignClient = serviceBookFeignClient;
    }

    @GetMapping("/books")
    public String getUserBook(){
       return serviceBookFeignClient.getAllBooks();
    }

}
