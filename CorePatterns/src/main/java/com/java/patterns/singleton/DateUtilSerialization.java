package com.java.patterns.singleton;

import java.io.Serializable;

public class DateUtilSerialization implements Serializable {

    private static final long serialVersionUID = 1L;

    private static volatile DateUtilSerialization instance;

    public static DateUtilSerialization getInstance(){
        if( instance == null){
            synchronized (DateUtilSerialization.class){
                if (instance == null){
                    instance = new DateUtilSerialization();
                }
            }
        }
        return instance;
    }

    // Serializable uses this readResolve to give same instance while reading and writing to a file.
    protected Object readResolve(){
        return instance;
    }

    // Overriding clone method in order to prevent cloning of this singleton class.
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
