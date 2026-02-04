package com.visaedu.universityservice.controller;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DatabaseTestController {

    private final MongoTemplate mongoTemplate;

    public DatabaseTestController(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @GetMapping("/api/db-test")
    public Map<String, Object> testMongo() {

        Map<String, Object> res = new HashMap<>();

        res.put("status", "✅ Connected Successfully");
        res.put("database", mongoTemplate.getDb().getName());
        res.put("collections",
                mongoTemplate.getDb()
                        .listCollectionNames()
                        .into(new java.util.ArrayList<>()));

        return res;
    }
}
