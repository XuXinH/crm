package com.xxh.mapper;

import com.xxh.pojo.Course;
import com.xxh.pojo.Sc;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Q
 * @version 1.0
 * @className ScMapper
 */
@Repository("ScMapper")
public interface ScMapper {
    /**
     * 选课
     * @param cid
     * @param sid
     * @return
     */
    int insertCourse(@Param("cid") long cid,@Param("sid") long sid);

    /**
     * 退课
     * @param cid
     * @return
     */
    int delCourse(@Param("cid") long cid,@Param("sid")long sid);

    /**
     * 获取选取该课程的学生id等信息
     * @param cid 课程id
     * @return
     */
    List<Sc> choiceCourseStu(long cid);

    int update(Sc sc);

    Sc getGrade(@Param("cid")long cid,@Param("sid") long sid);
}
