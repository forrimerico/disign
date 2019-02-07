package com.design.pattern.creational.factory;

public class JavaFactory extends Factory {
    public Vedio getVedio() {
        return new JavaVedio();
    }
}
