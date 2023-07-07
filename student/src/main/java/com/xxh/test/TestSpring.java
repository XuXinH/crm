package com.xxh.test;

import com.xxh.pojo.Movies;
import com.xxh.service.IMoviesService;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:conf/applicationContext.xml")
public class TestSpring {
    @Autowired
    private IMoviesService service;
    @Test
    public void testFindAll() {
        List<Movies> movies = service.findAll();
        for (Movies movie: movies) System.out.println(movie);
    }
}
