package com.design.pattern.creational.factory;

public class Main {
    public static void main(String[] args) {
        JavaFactory javaFactory = new JavaFactory();
        Vedio vedio = javaFactory.getVedio();
        vedio.produce();
    }
}
