package com.xxh.service.impl;

import com.xxh.mapper.ScMapper;
import com.xxh.pojo.Sc;
import com.xxh.service.ScService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Q
 * @version 1.0
 * @className ScServiceImpl
 */
@Service("ScService")
public class ScServiceImpl implements ScService {

    @Autowired
    private ScMapper scMapper;

    @Override
    public int insertCourse(@Param("cid") long cid, @Param("sid") long sid) {
        return scMapper.insertCourse(cid,sid);
    }

    @Override
    public int delCourse(@Param("cid") long cid, @Param("sid") long sid) {
        return scMapper.delCourse(cid, sid);
    }

    @Override
    public List<Sc> choiceCourseStu(long cid) {
        return scMapper.choiceCourseStu(cid);
    }

    @Override
    public int update(Sc sc) {
        return scMapper.update(sc);
    }

    @Override
    public Sc getGrade(@Param("cid") long cid, @Param("sid") long sid) {
        return scMapper.getGrade(cid,sid);
    }

}
