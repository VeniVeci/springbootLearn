package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @author VeniVeci
 * @Description
 * @create 2021/5/2 - 11:00
 */
@Controller
public class LoginController {

    @RequestMapping("/user/login")
    public String login(@RequestParam("username")String username,
                        @RequestParam("password")String password,
                        Model model,
                        HttpSession session
    ){
//        System.out.println(username);
        //业务逻辑
        if(!StringUtils.isEmpty(username)&& "123".equals(password)){
//            return "dashboard";
//            System.out.println("404");
//            return "404";
            session.setAttribute("loginuser", username);

            return "redirect:/main.html";
        } else {
            //告诉用户你登录失败了
            model.addAttribute("msg", "用户名或者密码错误");
            return "index";
        }
    }
}
