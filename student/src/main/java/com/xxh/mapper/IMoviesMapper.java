package com.xxh.mapper;

import com.xxh.pojo.Movies;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("IMoviesMapper")
public interface IMoviesMapper {

    List<Movies> findAll();
}
