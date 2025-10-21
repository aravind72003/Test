package com.aravindakshan.LearningSpring.controller;

import com.aravindakshan.LearningSpring.service.DiService;

public class DIController {

    private DiService service;

    public DIController(DiService service){
        this.service = service;
    }

    public String getGreeting(){
        return service.getGreeting();
    }
}
