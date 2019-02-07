package com.design.principle.demeter;

import com.design.principle.openclose.JavaCourse;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader {

    public void checkCourseNum()
    {
        List<Course> courseList = new ArrayList<Course>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        System.out.println("课程数量："+courseList.size());
    }
}
