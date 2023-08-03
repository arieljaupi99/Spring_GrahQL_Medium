package com.example.graphqlserver.repo;

import com.example.graphqlserver.model.Book;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepo {
    private List<Book> books = new ArrayList<>();
    private final AuthorRepo authorRepo;

    public BookRepo(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }

    public List<Book> findAll() {
        return books;
    }

    @PostConstruct
    private void init() {
        books.add(new Book(1,"Reactive Spring", authorRepo.findByName("Josh Long")));
        books.add(new Book(2,"Spring Boot Up & Running", authorRepo.findByName("Mark Heckler")));
        books.add(new Book(3,"Hacking with Spring Boot 2.3", authorRepo.findByName("Greg Turnquist")));
    }
}
