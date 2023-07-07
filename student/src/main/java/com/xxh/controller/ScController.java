package com.xxh.controller;

import com.xxh.pojo.Sc;
import com.xxh.pojo.Student;
import com.xxh.service.ScService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author Q
 * @version 1.0
 * @className ScController
 */
@Controller
@RequestMapping("sc")
public class ScController {
    @Autowired
    private ScService scService;

    /**
     * 学生选课
     * @param cid
     * @param sid
     * @return
     */
    @RequestMapping("choice/{cid}/{sid}")
    public String ChoiceCourse(@PathVariable("cid") long cid, @PathVariable("sid") long sid) {
       /* System.out.println(cid+","+sid);*/
        int i = scService.insertCourse(cid, sid);
        if(i != 0){
            return "index";
        }else {
            return "error";
        }
    }

    @RequestMapping("withdrawal/{sid}")
    public String WithdrawalCourse(@Param("cid") long cid, @PathVariable("sid") long sid){
        int i = scService.delCourse(cid,sid);
        if(i != 0){
            return "index";
        }else {
            return "error";
        }
    }

    @RequestMapping("choiceCourseStu")
    public ModelAndView choiceCourseStu(long cid){
        ModelAndView modelAndView = new ModelAndView();
        List<Sc> scs = scService.choiceCourseStu(cid);
        modelAndView.addObject("scs",scs);
        modelAndView.addObject("cid",cid);
        modelAndView.setViewName("sc/sc_choose");
        return modelAndView;
    }
    /**
     * 修改成绩
     * @param
     * @return
     */
    @RequestMapping("getGrades")
    public ModelAndView getGrades(@Param("cid")long cid,@Param("sid")long sid){
        Sc grade = scService.getGrade(cid, sid);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("grade",grade);
        modelAndView.addObject("index");
        return modelAndView;
    }


    @RequestMapping("update")
    public String update(Sc sc){
        System.out.println(sc);
        int update = scService.update(sc);
        if(update != 0){
            return "redirect:/sc/choiceCourseStu?cid="+sc.getCid();
        }
        return "error";
    }
}
