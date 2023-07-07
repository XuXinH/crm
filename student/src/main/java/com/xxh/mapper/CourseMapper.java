package com.xxh.mapper;

import com.xxh.pojo.Course;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("CourseMapper")
public interface CourseMapper {
    List<Course> getAll();

    int del(long cid);

    int update(Course course);

    Course getCourse(long cid);

    int add(Course course);

    int delAll(String[] cid);

    /**
     * 选课
     * 通过学生sid查询未选课程进行选课
     * @param sid 学生id
     * @return 课程（可能是集合）
     */
    List<Course> selectBySid(long sid);

    /**
     * 得到退课之前所选课程
     * @param sid 学生id
     * @return
     */
    List<Course> getWithdrawalBefore(long sid);

}
