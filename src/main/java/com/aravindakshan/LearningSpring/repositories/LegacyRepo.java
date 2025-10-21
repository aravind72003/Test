package com.aravindakshan.LearningSpring.repositories;

import com.aravindakshan.LearningSpring.database.FakeDataStore;

public class LegacyRepo {
    public String queryDatabase() {
        FakeDataStore store = new FakeDataStore();
        store.setUser("jt");
        store.setPassword("<PASSWORD>");
        store.setUrl("jdbc:mysql://localhost:3306/test");

        return store.queryDatabase();
    }
}
