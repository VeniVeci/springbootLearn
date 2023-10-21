package com.kuang;

import com.kuang.pojo.Dog;
import com.kuang.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot02ConfigApplicationTests {

    @Autowired //将狗狗自动注入进来
    Person person;
    @Test
    void contextLoads() {
        System.out.println(person); //打印看下狗狗对象
    }


    @Autowired //将狗狗自动注入进来
    Dog dog;

    @Test
    public void contextLoads2() {
        System.out.println(dog); //打印看下狗狗对象
    }


}
