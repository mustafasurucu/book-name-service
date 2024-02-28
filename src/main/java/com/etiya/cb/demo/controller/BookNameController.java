package com.etiya.cb.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookNameController {

    @GetMapping("book-name")
    public ResponseEntity<String> getBookName() {
        return ResponseEntity.ok("Name of the book from book-name-service");
    }
}
