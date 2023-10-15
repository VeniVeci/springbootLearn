package com.kuang.controller;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author VeniVeci
 * @Description
 * @create 2021/4/18
 */

@Controller
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }


}
