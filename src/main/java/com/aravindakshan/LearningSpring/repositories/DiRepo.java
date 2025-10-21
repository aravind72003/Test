package com.aravindakshan.LearningSpring.repositories;

import com.aravindakshan.LearningSpring.database.DIDataStore;

public class DiRepo implements Repo {
    private final DIDataStore store;

    public DiRepo(DIDataStore store) {
        this.store = store;
    }

    public String queryDatabase() {
        return store.queryDatabase();
    }
}
