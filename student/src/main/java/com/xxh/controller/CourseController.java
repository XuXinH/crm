package com.xxh.controller;

import com.xxh.pojo.Course;
import com.xxh.pojo.Student;
import com.xxh.service.CourseService;
import com.xxh.service.StudentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author Q
 * @version 1.0
 * @className CourseController
 */
@Controller
@RequestMapping("course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    /**
     * 查询课程列表(课程列表)
     * @return
     */
    @RequestMapping("list")
    public ModelAndView CourseList(){
        List<Course> course = courseService.getAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("course",course);
        modelAndView.setViewName("course/course_list");
        return modelAndView;
    }

    @RequestMapping("del")
    public String CourseDel(long cid){
        int del = courseService.del(cid);
        if(del != 0){
            return "redirect:/course/list";  //删除成功返回list页面
        }
        return "error";
    }

    @RequestMapping(value = "update",method = RequestMethod.POST)
    public String CourseUpdate(Course course){
        System.out.println(course);
        int update = courseService.update(course);
        if(update != 0){
            return "redirect:/course/list";
        }
        return "error";
    }

    @RequestMapping(value = "getCourse",method = RequestMethod.GET)
    public String getCourse(long cid, Model model){
        Course course = courseService.getCourse(cid);
        model.addAttribute("course",course);
        return "course/course_update";
    }

    /**
     * 添加页面，跳转到pages/course/course_add
     * @return
     */
    @RequestMapping("add")
    public String add() {
        return "course/course_add";
    }

    @RequestMapping("CourseAdd")
    public String CourseAdd(Course course){
        int add = courseService.add(course);
        if(add != 0){
            return "redirect:/course/list";
        }
        return "error";
    }

    @RequestMapping("delAll")
    public String delAll(@RequestParam("cid[]") String[] cid){
        int i = courseService.delAll(cid);
        if(i > 0){
            return "redirect:/course/list";
        }
        return "error";
    }

    /**
     * 选课之前先查询该学生未选课的课程
     * @param sid 学生id
     * @return 查询该学生未选课的课程
     */
    @RequestMapping("getNoChoiceCourse/{sid}")
    public ModelAndView ChoiceCourseBefore(@PathVariable("sid") long sid) {
        List<Course> courses = courseService.selectBySid(sid);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("courses", courses);
        modelAndView.addObject("sid",sid);
        System.out.println(courses);
        modelAndView.setViewName("StuCourse/course_choose");
        return modelAndView;
    }

    @RequestMapping("getWithdrawalBefore")
    public ModelAndView WithdrawalBefore(long sid) {
        List<Course> Withdrawal = courseService.getWithdrawalBefore(sid);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("Withdrawal", Withdrawal);
        modelAndView.addObject("sid",sid);
        System.out.println(Withdrawal);
        modelAndView.setViewName("StuCourse/course_withdrawal");
        return modelAndView;
    }

    /**
     * 查询课程列表(课程列表)
     * @return
     */
    @RequestMapping("CourseList")
    public ModelAndView CourseListAsSc(){
        List<Course> courseAsSc = courseService.getAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("courseAsSc",courseAsSc);
        modelAndView.setViewName("sc/scList");
        return modelAndView;
    }
}
