package com.example.graphqlclient.services;

import java.util.List;

import ariel.jaupi.medium.Book;
import com.graphql_java_generator.exception.GraphQLRequestExecutionException;
import com.graphql_java_generator.exception.GraphQLRequestPreparationException;

public interface BookService {
    public List<Book> allBooks() throws GraphQLRequestPreparationException, GraphQLRequestExecutionException;
}
