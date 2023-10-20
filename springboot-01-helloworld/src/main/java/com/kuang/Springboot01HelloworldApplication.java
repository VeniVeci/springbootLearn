package com.kuang;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot01HelloworldApplication {

    public static void main(String[] args) {
//        SpringApplication.run(Springboot01HelloworldApplication.class, args);
        SpringApplication app = new SpringApplication(Springboot01HelloworldApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

}
