package com.aravindakshan.LearningSpring.controller;

import com.aravindakshan.LearningSpring.database.DIDataStore;
import com.aravindakshan.LearningSpring.database.DataStore;
import com.aravindakshan.LearningSpring.repositories.DiRepo;
import com.aravindakshan.LearningSpring.repositories.Repo;
import com.aravindakshan.LearningSpring.service.DiService;
import com.aravindakshan.LearningSpring.service.DiServiceImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MimicSpringContextTest {
    public static Map<String, Object> context = new HashMap<>();

    public static void addBean(String beanName, Object bean){
        context.put(beanName, bean);
    }

    public static Object getBean(String beanName){
        return context.get(beanName);
    }

    @BeforeAll
    static void beforeAll(){
        addBean("dataStore", new DIDataStore("jt","1234","jdbc:mysql://localhost:3306/test"));
        addBean("repo", new DiRepo(
                (DIDataStore) getBean("dataStore")
        ));
        addBean("diService", new DiServiceImpl((Repo) getBean("repo")));
        addBean("diController", new DIController((DiService)  getBean("diService")));
    }

    @Test
    void getControllerFromContext(){
        DIController controller = (DIController) getBean("diController");
        System.out.println((controller.getGreeting()));
    }
}
