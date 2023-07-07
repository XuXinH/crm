package com.xxh.service.impl;

import com.xxh.mapper.StuCourseMapper;
import com.xxh.pojo.Course;
import com.xxh.pojo.StuCourse;
import com.xxh.service.StuCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Q
 * @version 1.0
 * @className StuCourseServiceImpl
 */

@Service("StuCourseService")
public class StuCourseServiceImpl implements StuCourseService {

    @Autowired
    private StuCourseMapper stuCourseMapper;

    @Override
    public List<StuCourse> getAllStuCourse(StuCourse stuCourse) {
        return stuCourseMapper.getAllStuCourse(stuCourse);
    }

   /* @Override
    public List<Course> selectBySid(long sid) {
        return stuCourseMapper.selectBySid(sid);
    }*/
}
