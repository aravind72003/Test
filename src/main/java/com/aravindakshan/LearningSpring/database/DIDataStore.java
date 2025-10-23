package com.aravindakshan.LearningSpring.database;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DIDataStore implements DataStore {
    private String user;
    private String password;
    private String url;

    public DIDataStore(@Value("${aravindakshan.sfg.user}") String user,
                       @Value("${aravindakshan.sfg.password}") String password,
                       @Value("${aravindakshan.sfg.url}") String url) {
        this.user = user;
        this.password = password;
        this.url = url;
    }

    public String queryDatabase() {
        return "hello world";
    }
}
