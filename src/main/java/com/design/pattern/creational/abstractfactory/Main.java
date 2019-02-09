package com.design.pattern.creational.abstractfactory;

public class Main {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Article article = courseFactory.getArticle();
        article.produce();
    }
}
