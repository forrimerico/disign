package com.design.principle.compositionaggregation;

public class MongoDBConnection extends DBConnection {
    public String getConnection() {
        return "MongoDBConnection连接";
    }
}
