package com.aravindakshan.LearningSpring.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LegacyControllerTest {

    @Test
    void testGetGreeting(){
        LegacyController legacyController = new LegacyController();
        assertEquals("Hello World!",legacyController.getGreeting());

        System.out.println(legacyController.getGreeting());
    }

}
