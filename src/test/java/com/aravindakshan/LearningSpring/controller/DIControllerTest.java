package com.aravindakshan.LearningSpring.controller;

import com.aravindakshan.LearningSpring.database.DIDataStore;
import com.aravindakshan.LearningSpring.repositories.DiRepo;
import com.aravindakshan.LearningSpring.service.DiService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DIControllerTest {
    private DIController diController;
    private DiRepo diRepo;
    private DiService diService;
    private DIDataStore diDataStore;

    @BeforeEach
    void setUp(){
        diDataStore = new DIDataStore("testUser", "testPassword","testUrl");
        diRepo = new DiRepo(diDataStore);
        diService = new DiService(diRepo);
        diController = new DIController(diService);
    }


    @Test
    void getGreeting(){
        String expectedGreeting = "hello world";
        String actualGreeting = diController.getGreeting();
        assertEquals(expectedGreeting, actualGreeting);

        System.out.println(actualGreeting);
    }
}


