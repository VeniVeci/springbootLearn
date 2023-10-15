package com.kuang;

import com.kuang.controller.HelloController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot01HelloworldApplicationTests {
    @Autowired
    private HelloController controller; // Inject any service or component you want to test
    @Test
    void contextLoads() {
        System.out.println(controller.hello());
    }

}
