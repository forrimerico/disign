package com.design.principle.compositionaggregation;

/**
 * 组合复用原则
 */
public class Main {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new MongoDBConnection());
        productDao.addProduct();
    }
}
