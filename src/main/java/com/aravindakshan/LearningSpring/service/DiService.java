package com.aravindakshan.LearningSpring.service;

import com.aravindakshan.LearningSpring.repositories.DiRepo;

public class DiService {
    private DiRepo repo;

    public DiService(DiRepo repo) {
        this.repo = repo;
    }

    public String getGreeting() {
        return repo.queryDatabase();
    }
}
