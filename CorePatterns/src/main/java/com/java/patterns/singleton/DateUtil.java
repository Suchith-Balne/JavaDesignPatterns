package com.java.patterns.singleton;

/**
 * Singleton Class.
 * It is a object creation patterns that allows the application to create one and only one instance no matter how many times it is used.
 */
public class DateUtil {

    //1) Declare a private DateUtil instance.
    private static DateUtil instance;

    // ** Eager initialization can be used if you are sure that DateUtil is used atleast once.
    // ** Eager Initialization Method 1.
    private static DateUtil instance1 = new DateUtil();

    private static DateUtil instance2;

    // ** Eager Initialization Method 2 using static block.
    static{
        instance2 = new DateUtil();
    }

    // 2) Define a private constructor.
    private DateUtil(){

    }

    // 3) Delcare a static method.
    public static DateUtil getInstance(){
        if(instance == null){
            instance = new DateUtil();
        }
        return instance;
    }

    // ** Eager Initialization Method 1
    public static DateUtil getInstance1(){
        return instance1;
    }

}
