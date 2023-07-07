package com.xxh.mapper;

import com.xxh.pojo.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("StudentMapper")
public interface StudentMapper {
    /**
     * 查询所有
     * @return 返回查询结果
     */
    List<Student> getAll();

    /**
     * 删除单个信息
     * @param sno 学生id
     * @return 返回1则成功删除，其他则删除失败
     */
    int del(String sno);

    /**
     * 查询学生信息
     * @param sid
     * @return
     */
    Student getStudent(Integer sid);
    /**
     * 修改学生信息
     * @param student 学生信息
     * @return 返回1则成功删除，其他则删除失败
     */
    int StudentUpdate(Student student);

    /**
     * 删除所有学生信息
     * @return
     */
    int delAll(String[] sid);

    /**
     * 增加学生
     * @param student 学生信息
     * @return 返回1则成功删除，其他则删除失败
     */
    int insert(Student student);

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
