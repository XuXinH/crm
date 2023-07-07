package com.xxh.service.impl;

import com.xxh.mapper.StudentMapper;
import com.xxh.pojo.Student;
import com.xxh.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Q
 * @version 1.0
 * @className StudentServiceImpl
 */
@Service("StudentService")
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    /**
     * 获取学生列表
     * @return
     */
    @Override
    public List<Student> getAll() {
        return studentMapper.getAll();
    }

    @Override
    public int del(String sno) {
        return studentMapper.del(sno);
    }

    @Override
    public Student getStudent(Integer sid) {
        return studentMapper.getStudent(sid);
    }

    @Override
    public int StudentUpdate(Student student) {
        return studentMapper.StudentUpdate(student);
    }

    @Override
    public int add(Student student) {
        return studentMapper.insert(student);
    }

    @Override
    public int delAll(String[] sid) {
        return studentMapper.delAll(sid);
    }

    @Override
    public List<Student> findAll() {
        return studentMapper.findAll();
    }

    @Override
    public List<Student> EnterGradesBefore(long sid) {
        return studentMapper.EnterGradesBefore(sid);
    }

    @Override
    public List<Student> choiceCourseStu(long cid) {
        return studentMapper.choiceCourseStu(cid);
    }
}
