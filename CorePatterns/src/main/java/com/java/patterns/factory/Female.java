package com.java.patterns.factory;

public class Female implements Person{

    @Override
    public void wish(String message) {
        System.out.println("Female:" + message);
    }
}
