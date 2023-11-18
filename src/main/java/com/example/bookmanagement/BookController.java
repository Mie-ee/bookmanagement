package com.example.bookmanagement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    private final BookMapper bookMapper;

    public BookController(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @GetMapping("/books")
    public List<Book> findAll() {
        return bookMapper.findAll();
    }

    @GetMapping("/books/search")
    public List<Book> findByTitle(BookSearchRequest request) {

        System.out.println(request.getStartsWith());
        System.out.println(request.getEndsWith());
        System.out.println(request.getContains());
         
        return bookMapper.findByTitle(request.getStartsWith(), request.getEndsWith(), request.getContains());
    }

}
