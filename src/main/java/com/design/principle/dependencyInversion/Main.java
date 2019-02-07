package com.design.principle.dependencyInversion;

public class Main {
    public static void main(String[] args) {
        StudyCourse studyCourse = new StudyCourse();
        studyCourse.study(new EnglishCourse());
    }
}
