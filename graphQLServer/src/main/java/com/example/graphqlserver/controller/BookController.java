package com.example.graphqlserver.controller;

import com.example.graphqlserver.model.Book;
import com.example.graphqlserver.repo.BookRepo;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookController {
    private final BookRepo bookRepo;

    public BookController(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    @QueryMapping
    public List<Book> allBooks() {
        return this.bookRepo.findAll();
    }
}
