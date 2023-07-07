package com.xxh.test;

import com.xxh.mapper.IMoviesMapper;
import com.xxh.pojo.Movies;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;
    private InputStream inputStream;
    @Before
    public void init() throws IOException {
        String resource = "mybatis.xml";
        // 加载主配置文件
        inputStream = Resources.getResourceAsStream(resource);
        // 获取 SqlSessionFactory 对象
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession  = sqlSessionFactory.openSession();
    }
    @After
    public void destroy() throws IOException {
        sqlSession.close();
        inputStream.close();
    }
    @Test
    public void testAll() {
        IMoviesMapper mapper = sqlSession.getMapper(IMoviesMapper.class);
        List<Movies> list = mapper.findAll();
        for (Movies movie: list) System.out.println(movie);
    }
}
