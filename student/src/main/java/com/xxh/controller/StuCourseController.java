package com.xxh.controller;

import com.xxh.pojo.Course;
import com.xxh.pojo.StuCourse;
import com.xxh.service.StuCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author Q
 * @version 1.0
 * @className StuCourse
 */
@Controller
@RequestMapping("StuCourse")
public class StuCourseController {

    @Autowired
    private StuCourseService stuCourseService;

    @RequestMapping("list")
    public ModelAndView StudentList(StuCourse stuCourse){
        List<StuCourse> StuCourse = stuCourseService.getAllStuCourse(stuCourse);
        System.out.println(StuCourse);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("StuCourse",StuCourse);
        modelAndView.setViewName("StuCourse/StuCourseList");
        return modelAndView;
    }

  /*
    @RequestMapping("choice")
    public ModelAndView ChoiceCourseBefore(long sid){
        List<Course> courses = stuCourseService.selectBySid(sid);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("courses",courses);
        System.out.println(courses);
        modelAndView.setViewName("StuCourse/course_choose");
        return modelAndView;
    }*/
}
