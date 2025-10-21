package com.aravindakshan.LearningSpring.service;

import com.aravindakshan.LearningSpring.repositories.Repo;

public class DiServiceImpl implements DiService{
    private Repo repo;

    public DiServiceImpl(Repo repo) {
        this.repo = repo;
    }

    public String getGreeting() {
        return repo.queryDatabase();
    }
}
