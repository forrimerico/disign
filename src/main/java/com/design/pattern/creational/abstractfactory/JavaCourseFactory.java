package com.design.pattern.creational.abstractfactory;

public class JavaCourseFactory implements CourseFactory {
    public Vedio getVideo() {
        return new JavaVideo();
    }

    public Article getArticle() {
        return new JavaArticle();
    }
}
