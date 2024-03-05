package com.java.patterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

public class RefelctionProblem {


    // Even if the pconstructor is private and class is singleton we can get the constructor using Java Refelction API.
    public static void main(String[] args) throws NoSuchMethodException {

        DateUtil dateUtil = DateUtil.getInstance();
        DateUtil dateUtil2 = null;

        Constructor[] constructors = new Constructor[]{DateUtil.class.getDeclaredConstructor()};
        for (Constructor constructor : constructors){
            constructor.setAccessible(true);
            try{
                dateUtil2 = (DateUtil) constructor.newInstance();
                break;
            } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e){
                e.printStackTrace();
            }
        }
        System.out.println(dateUtil.hashCode());
        System.out.println(dateUtil2.hashCode());
    }

    // To solve this use enums

}
