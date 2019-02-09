package com.design.pattern.creational.singleton;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("end");
    }
}
