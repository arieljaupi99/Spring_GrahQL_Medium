package com.example.graphqlserver.model;

public record Author(Integer id,String name, String surname) {
    public String fullName(){
        return this.name + " " + this.surname;
    }
}
