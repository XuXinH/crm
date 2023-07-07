package com.xxh.service;

import com.xxh.pojo.Course;
import com.xxh.pojo.StuCourse;

import java.util.List;

public interface StuCourseService {
    /**
     * 获取学生选课信息
     * @return
     */
    List<StuCourse> getAllStuCourse(StuCourse stuCourse);

/*    *//**
     * 选课
     * 通过学生sid查询未选课程进行选课
     * @param sid 学生id
     * @return 返回课程集合
     *//*
    List<Course> selectBySid(long sid);*/
}
