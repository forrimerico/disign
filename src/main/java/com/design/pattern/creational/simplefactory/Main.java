package com.design.pattern.creational.simplefactory;

public class Main {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        Vedio vedio = factory.getVedio(JavaVedio.class);
        vedio.produce();
    }
}
