package com.xxh.mapper;

/*学生选课*/

import com.xxh.pojo.Course;
import com.xxh.pojo.StuCourse;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("StuCourseMapper")
public interface StuCourseMapper {
    /**
     * 获取学生选课信息
     * @return
     */
    List<StuCourse> getAllStuCourse(StuCourse stuCourse);

   /* *//**
     * 选课
     * 通过学生sid查询未选课程进行选课
     * @param sid 学生id
     * @return 课程（可能是集合）
     *//*
    List<Course> selectBySid(long sid);*/
}
