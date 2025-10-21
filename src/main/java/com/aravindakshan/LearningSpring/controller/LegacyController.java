package com.aravindakshan.LearningSpring.controller;

import com.aravindakshan.LearningSpring.service.LegacyGreetingService;

public class LegacyController {

    public String getGreeting(){
        LegacyGreetingService legacyGreetingService = new LegacyGreetingService();
        return legacyGreetingService.getGreeting();
    }
}
