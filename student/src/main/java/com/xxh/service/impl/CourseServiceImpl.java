package com.xxh.service.impl;

import com.xxh.mapper.CourseMapper;
import com.xxh.pojo.Course;
import com.xxh.pojo.Student;
import com.xxh.service.CourseService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Q
 * @version 1.0
 * @className CourseServiceImpl
 */
@Service("CourseService")
@Transactional
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseMapper courseMapper;
    @Override
    public List<Course> getAll() {
        return courseMapper.getAll();
    }

    @Override
    public int del(long cid) {
        return courseMapper.del(cid);
    }

    @Override
    public int update(Course course) {
        return courseMapper.update(course);
    }

    @Override
    public Course getCourse(long cid) {
        return courseMapper.getCourse(cid);
    }

    @Override
    public int add(Course course) {
        return courseMapper.add(course);
    }

    @Override
    public int delAll(String[] cid) {
        return courseMapper.delAll(cid);
    }

    @Override
    public List<Course> selectBySid(long sid) {
        return courseMapper.selectBySid(sid);
    }

    @Override
    public List<Course> getWithdrawalBefore(long sid) {
        return courseMapper.getWithdrawalBefore(sid);
    }
}
