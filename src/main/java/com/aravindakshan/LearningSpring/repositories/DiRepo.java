package com.aravindakshan.LearningSpring.repositories;

import com.aravindakshan.LearningSpring.database.DIDataStore;
import com.aravindakshan.LearningSpring.database.DataStore;
import org.springframework.stereotype.Component;

@Component
public class DiRepo implements Repo {
    private DataStore store;

    public DiRepo(DIDataStore store) {
        this.store = store;
    }

    public String queryDatabase() {
        return store.queryDatabase();
    }
}
