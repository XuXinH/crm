package com.xxh.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * @author Q
 * @version 1.0
 * @className LoginInterceptor
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        //登录页面不需要拦截
        System.out.println("uri:"+request.getRequestURI());
        String uri = request.getRequestURI();
        if(uri.contains("/login") || uri.contains("/register") || uri.contains("/css/") || uri.contains("/js/")
            || uri.contains("images")){
            return true;
        }
        HttpSession session = request.getSession();

        if(session.getAttribute("SUCCESS") != null){
            return true;
        }
        //用户没有登录则跳转到登录页面
        request.getRequestDispatcher("/login.jsp").forward(request,response);
        return false;
    }
}
