package com.example.graphqlclient.services.impl;



import ariel.jaupi.medium.Book;
import ariel.jaupi.medium.util.QueryExecutor;
import com.example.graphqlclient.services.BookService;
import com.graphql_java_generator.exception.GraphQLRequestExecutionException;
import com.graphql_java_generator.exception.GraphQLRequestPreparationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    final String requestQuery = """
            {
            title
            author{
            name
            surname
            }
            }
            """;

    @Autowired
    QueryExecutor queryExecutor;

    @Override
    public List<Book> allBooks() throws GraphQLRequestPreparationException, GraphQLRequestExecutionException {
       return this.queryExecutor.allBooks(requestQuery);
    }
}
