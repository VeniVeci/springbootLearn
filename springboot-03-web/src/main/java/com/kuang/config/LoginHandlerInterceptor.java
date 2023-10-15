package com.kuang.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author VeniVeci
 * @Description
 * @create 2021/5/2 - 11:51
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        //登录成功之后，应该有用户的session
        Object loginuser = request.getSession().getAttribute("loginuser");

//        System.out.println("loginuser="+loginuser);
        if (loginuser == null) {
            //没有登录，而是直接进入的首页，肯定是不让进的
//            System.out.println("没有权限，请先登录");
            request.setAttribute("msg", "没有权限，请先登录");
            request.getRequestDispatcher("/index.html").forward(request, response);
            return false;
        } else {
            return true;
        }



    }
}
