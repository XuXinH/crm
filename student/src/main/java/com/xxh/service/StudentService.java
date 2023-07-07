package com.xxh.service;

import com.xxh.pojo.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAll();

    int del(String sno);

    Student getStudent(Integer sid);

    int StudentUpdate(Student student);

    int add(Student student);

    int delAll(String[] sid);

    /**
     * 多表查询
     * @return
     */
    List<Student> findAll();

    /**
     * 多表查询（录入成绩之前的查询）
     * @return
     */
    List<Student> EnterGradesBefore(long sid);

    /**
     * 多表查询选择该课程的学生
     * @return
     */
    List<Student> choiceCourseStu(long cid);
}
