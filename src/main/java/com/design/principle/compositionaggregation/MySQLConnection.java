package com.design.principle.compositionaggregation;

public class MySQLConnection extends DBConnection {
    public String getConnection() {
        return "MySQL连接";
    }
}
