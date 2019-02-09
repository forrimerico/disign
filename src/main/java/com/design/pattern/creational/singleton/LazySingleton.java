package com.design.pattern.creational.singleton;

public class LazySingleton {
    // 懒汉式代码
//    private static LazySingleton lazySingleton = null;
    // doublecheck 线程安全代码
    private volatile static LazySingleton lazySingleton = null;

    private LazySingleton(){}

    /**
     * 线程不安全的懒汉式单例模式
     * @return
     */
//    public static LazySingleton getInstance()
//    {
//        if (lazySingleton == null) {
//            lazySingleton = new LazySingleton();
//        }
//
//        return lazySingleton;
//    }

    /**
     * 这种方法可以解决线程不安全的问题，但是性能比较低
     * @return
     */
//    public synchronized static LazySingleton getInstance()
//    {
//        if (lazySingleton == null) {
//            lazySingleton = new LazySingleton();
//        }
//
//        return lazySingleton;
//    }

    /**
     * double check 性能较高的方案
     * 单例对象需要声明关键字  volatile
     * 因为在 new 一个对象的时候，经历了三个步骤
     * 1、分配内存
     * 2、创建变量，指向这个内存地址
     * 3、初始化对象
     * 其中 2 3 有可能会被重排序（一定的几率）
     * 这是不行的。（lazySingleton不为null，但是对象并没有被初始化，会导致程序异常）
     * @return
     */
    public static LazySingleton getInstance()
    {
        if (lazySingleton == null) {
            synchronized (LazySingleton.class) {
                if (lazySingleton == null) {
                    lazySingleton = new LazySingleton();
                }
            }
        }

        return lazySingleton;
    }
}
