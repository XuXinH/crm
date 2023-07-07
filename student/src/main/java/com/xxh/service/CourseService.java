package com.xxh.service;

import com.xxh.pojo.Course;
import com.xxh.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseService {
    List<Course> getAll();

    int del(long cid);

    int update(Course course);

    Course getCourse(long cid);

    int add(Course course);

    int delAll(String[] cid);

    /**
     * 退课之前查询
     * @param sid
     * @return
     */
    List<Course> selectBySid(long sid);

    /**
     * 退课之前查询
     * @param sid
     * @return
     */
    List<Course> getWithdrawalBefore(long sid);
}
