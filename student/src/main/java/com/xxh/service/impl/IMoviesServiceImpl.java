package com.xxh.service.impl;

import com.xxh.mapper.IMoviesMapper;
import com.xxh.pojo.Movies;
import com.xxh.service.IMoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("IMoviesService")
@Transactional
public class IMoviesServiceImpl implements IMoviesService {
    @Autowired
    private IMoviesMapper mapper;
    @Override
    public List<Movies> findAll() {
        System.out.println("执行了service");
        return mapper.findAll();
    }
}
