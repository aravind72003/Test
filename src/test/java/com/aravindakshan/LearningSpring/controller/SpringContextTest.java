package com.aravindakshan.LearningSpring.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SpringContextTest {
    @Autowired
    DIController controller;

    @Test
    void testSpringController(){
        System.out.println(controller.getGreeting());
    }
}
