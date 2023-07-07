package com.xxh.controller;

import com.xxh.pojo.Admin;
import com.xxh.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author Q
 * @version 1.0
 * @className AdminController
 */
@Controller()
@RequestMapping("admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping("login")
    public String login(Admin admin, HttpSession session){
        Admin login = adminService.login(admin);
        System.out.println(login.getUname());
        if(login != null){
            session.setAttribute("SUCCESS",admin);
            return "index";
        }else{
            return "error";
        }
    }


    @RequestMapping("register")
    public String register(Admin admin){
        int register = adminService.register(admin);
        if(register != 0){
            return "redirect:/login.jsp";
        }else{
            return "error";
        }
    }

    /**
     * 注销
     * @return
     */
    @RequestMapping("logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/login.jsp";
    }

    @RequestMapping("index")
    public String index(){
        return "index";
    }
}
