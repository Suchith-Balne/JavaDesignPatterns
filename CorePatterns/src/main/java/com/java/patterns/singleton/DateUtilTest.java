package com.java.patterns.singleton;

import java.io.*;

public class DateUtilTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        DateUtil dateUtil1 = DateUtil.getInstance();
//        DateUtil dateUtil2 = DateUtil.getInstance();
//
//        System.out.println(dateUtil1 == dateUtil2);


//        DateUtilSerialization dateUtilSerialization1 = DateUtilSerialization.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
//                new File("F:/JavaDesignPatterns/CorePatterns/src/main/resources/DateUtil.ser")));
//        oos.writeObject(dateUtilSerialization1);
//
//        DateUtilSerialization dateUtilSerialization2 = null;
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("F:/JavaDesignPatterns/CorePatterns/src/main/resources/DateUtil.ser")));
//        dateUtilSerialization2 = (DateUtilSerialization) ois.readObject();
//
//        oos.close();
//        ois.close();
//
//        System.out.println(dateUtilSerialization1 == dateUtilSerialization2);

        Logger logger = Logger.getInstance();
        logger.log("Hello");








    }
}
