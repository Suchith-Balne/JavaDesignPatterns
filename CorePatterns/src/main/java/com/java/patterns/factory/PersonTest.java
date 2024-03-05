package com.java.patterns.factory;

public class PersonTest {
    public static void main(String[] args) {
        Person p = PersonFactory.createPerson("Female");
        p.wish("Hello");

    }
}
