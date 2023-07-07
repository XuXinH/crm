package com.xxh.controller;

import com.xxh.pojo.Movies;
import com.xxh.service.IMoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("moviesController")
public class MoviesController {
    @Autowired
    private IMoviesService service;

    @RequestMapping("findAll")
    public String findAll(Model model) {
        System.out.println("访问到controller");
        List<Movies> movies = service.findAll();
        model.addAttribute("movies", movies);
        return "success";
    }
}
