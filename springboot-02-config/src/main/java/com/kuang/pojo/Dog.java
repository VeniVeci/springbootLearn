package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Min;

/**
 * @author Zhangxuhui
 * @Description
 * @create 2021/4/18 - 10:44
 */
@Component
@ConfigurationProperties(prefix = "dog")
@Validated
public class Dog {
//    @Value("阿黄")
    private String name;
//    @Value("18")
    @Min(value = 5,message = "不能小于5")
    private Integer age;


    public Dog() {
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
