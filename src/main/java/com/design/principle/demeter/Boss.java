package com.design.principle.demeter;

import com.design.principle.openclose.JavaCourse;

import java.util.ArrayList;
import java.util.List;

public class Boss {
    public void command(TeamLeader teamLeader)
    {
        teamLeader.checkCourseNum();
    }
}
