package com.aravindakshan.LearningSpring.service;

import com.aravindakshan.LearningSpring.repositories.LegacyRepo;

public class LegacyGreetingService {

    public String getGreeting() {
        LegacyRepo legacyRepo = new LegacyRepo();
        return legacyRepo.queryDatabase();
    }

}
