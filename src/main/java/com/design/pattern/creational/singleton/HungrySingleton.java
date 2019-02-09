package com.design.pattern.creational.singleton;

import org.redisson.connection.ConnectionEventsHub;

public class HungrySingleton {
    private final static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance()
    {
        return hungrySingleton;
    }
}
