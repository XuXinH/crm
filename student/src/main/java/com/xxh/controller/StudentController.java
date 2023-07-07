package com.xxh.controller;

import com.xxh.pojo.Student;
import com.xxh.service.StudentService;
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
 * @className StudentController
 */
@Controller
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    /**
     * 查询学生列表
     * @return
     */
    @RequestMapping("list")
    public ModelAndView StudentList(){
        List<Student> stus = studentService.getAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("stus",stus);
        modelAndView.setViewName("student/list");
        return modelAndView;
    }

    @RequestMapping("del")
    public String StudentDel(String sno){
        int del = studentService.del(sno);
        if(del != 0){
            return "redirect:/student/list";  //删除成功返回list页面
        }
        return "error";
    }

    /**
     * 修改之前先查询
     * @param sid
     * @param model
     * @return
     */
    @RequestMapping(value = "getStudent",method = RequestMethod.GET)
    public String getStudent(Integer sid, Model model){
        Student student = studentService.getStudent(sid);
        model.addAttribute("stu",student);
        return "student/update";
    }

    @RequestMapping(value = "updateStudent",method = RequestMethod.POST)
    public String StudentUpdate(Student student){
        System.out.println(student);
        int studentUpdate = studentService.StudentUpdate(student);
        if (studentUpdate != 0){
            return "redirect:/student/list";
        }
        return "error";
    }

    @RequestMapping("delAll")
    public String StudentDelAll(@RequestParam("sid[]") String[] sid){
        int i = studentService.delAll(sid);
        if(i != 0){
            return "redirect:/student/list";
        }else{
            return "error";
        }
    }

    @RequestMapping("CourseAdd")
    public String StudentAdd(Student student){
        int add = studentService.add(student);
        if(add != 0){
            return "redirect:/student/list";
        }
        return "error";
    }

    /**
     * 多表查询
     * @return
     */
    @RequestMapping("StuCourseList")
    public ModelAndView StuCourseList(){
        List<Student> StuCourse = studentService.findAll();

      /*  System.out.println(StuCourse);
        System.out.println(StuCourse.get(0).getCourseList().get(0).getCname());*/
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("StuCourse",StuCourse);
        modelAndView.setViewName("StuCourse/StuCourseList");
        return modelAndView;
    }

    /**
     * 多表查询
     * @return
     */
    @RequestMapping("ScList")
    public ModelAndView ScList(){
        List<Student> EnterGrades = studentService.findAll();
        System.out.println(EnterGrades);
      /*  System.out.println(StuCourse);
        System.out.println(StuCourse.get(0).getCourseList().get(0).getCname());*/
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("EnterGrades",EnterGrades);
        modelAndView.setViewName("sc/scList");
        return modelAndView;
    }


    @RequestMapping("EnterGradesBefore")
    public ModelAndView ScEnterGrades(long sid){
        List<Student> ScEnterGrades = studentService.EnterGradesBefore(sid);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("ScEnterGrades",ScEnterGrades);
        modelAndView.setViewName("sc/sc_choose");
        /*System.out.println(ScEnterGrades);*/
        return modelAndView;
    }

    @RequestMapping("choiceCourseStu")
    public ModelAndView choiceCourseStu(long cid){
        ModelAndView modelAndView = new ModelAndView();
        List<Student> students = studentService.choiceCourseStu(cid);
        modelAndView.addObject("students",students);
        modelAndView.addObject("cid",cid);
        modelAndView.setViewName("sc/sc_choose");
        return modelAndView;
    }


    /**
     * 添加页面，跳转到pages/student/add.jsp
     * @return
     */
    @RequestMapping("add")
    public String CourseAdd() {
        return "student/add";
    }
}
