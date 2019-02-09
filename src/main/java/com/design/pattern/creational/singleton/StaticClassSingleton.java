package com.design.pattern.creational.singleton;

/**
 * 基于静态内部类的单例模式写法
 * 也是利用了创建类的过程中，会加锁的机制，来保证线程安全
 */
public class StaticClassSingleton {
    private static class InnerClassSingleton {
        private static StaticClassSingleton staticClassSingleton = new StaticClassSingleton();
    }
    public static StaticClassSingleton getInstance()
    {
        return InnerClassSingleton.staticClassSingleton;
    }
}
