package com.xxh.service;

import com.xxh.pojo.Sc;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ScService {
    /**
     * 选课
     * @param cid 课程编号
     * @param sid 学生编号
     * @return 1为成功
     */
    int insertCourse(@Param("cid") long cid, @Param("sid") long sid);

    /**
     * 退课
     * @param cid
     * @return
     */
    int delCourse(@Param("cid") long cid, @Param("sid") long sid);

    /**
     * 获取选取该课程的学生id等信息
     * @param cid 课程id
     * @return
     */
    List<Sc> choiceCourseStu(long cid);

    int update(Sc sc);

    Sc getGrade(@Param("cid")long cid,@Param("sid") long sid);
}
