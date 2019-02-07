package com.design.pattern.creational.factory;

public class PythonFactory extends Factory {
    public Vedio getVedio() {
        return new PythonVedio();
    }
}
