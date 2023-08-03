package com.example.graphqlclient.controller;


import ariel.jaupi.medium.Book;
import com.example.graphqlclient.services.BookService;
import com.graphql_java_generator.exception.GraphQLRequestExecutionException;
import com.graphql_java_generator.exception.GraphQLRequestPreparationException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/allBooks")
    public List<Book> getAllBooks() throws GraphQLRequestPreparationException, GraphQLRequestExecutionException {
        return this.bookService.allBooks();
    }
}
