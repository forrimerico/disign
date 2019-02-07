package com.design.principle.openclose;

import com.design.principle.openclose.Course;
import com.design.principle.openclose.JavaCourse;
import com.design.principle.openclose.JavaDiscountCourse;

public class Main {
    public static void main(String[] args) {
        Course course = new JavaDiscountCourse(1, "设计模式", 299d);
        JavaDiscountCourse jdCource = (JavaDiscountCourse) course;
        jdCource.getDiscountPrice();
    }
}
