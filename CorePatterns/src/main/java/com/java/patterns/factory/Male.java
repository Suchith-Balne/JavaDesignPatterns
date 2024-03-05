package com.java.patterns.factory;

public class Male implements Person{
    @Override
    public void wish(String message) {
        System.out.println("Male: " + message);
    }
}
