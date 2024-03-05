package com.java.patterns.singleton;

/**
 * Singleton Class.
 * It is a object creation patterns that allows the application to create one and only one instance no matter how many times it is used.
 */
public class DataUtilMultithreaded {

    //1) Declare a private DateUtil instance.
    private static volatile DataUtilMultithreaded instance; // Make instance volatile to avoid issues in multi-threaded env.

    // 2) Define a private constructor.
    private DataUtilMultithreaded(){

    }

    // 3) Delcare a static method.
    public static DataUtilMultithreaded getInstance(){
        if(instance == null){   // Improved multi threaded performance
            synchronized (DataUtilMultithreaded.class){
                if(instance == null){
                    instance = new DataUtilMultithreaded();
                }
            }
        }
        return instance;
    }


}
