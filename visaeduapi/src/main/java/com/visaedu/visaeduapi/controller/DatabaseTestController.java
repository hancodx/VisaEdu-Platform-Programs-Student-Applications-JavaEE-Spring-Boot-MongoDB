package com.visaedu.visaeduapi.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.bson.Document;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatabaseTestController {

    private final MongoTemplate mongoTemplate;

    public DatabaseTestController(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @GetMapping("/api/db-test")
    public Map<String, Object> testDatabaseConnection() {

        Map<String, Object> response = new LinkedHashMap<>();

        try {
            String dbName = mongoTemplate.getDb().getName();

            Document ping = mongoTemplate.getDb().runCommand(new Document("ping", 1));

            Iterable<String> collections = mongoTemplate.getDb().listCollectionNames();

            Map<String, Long> collectionInfo = new LinkedHashMap<>();

            for (String col : collections) {
                long count = mongoTemplate.getCollection(col).countDocuments();
                collectionInfo.put(col, count);
            }

            // Response JSON
            response.put("status", "✅ Connected Successfully");
            response.put("database", dbName);
            response.put("ping", ping.toJson());
            response.put("collections", collectionInfo);

        } catch (Exception e) {
            response.put("status", "❌ Connection Failed");
            response.put("error", e.getMessage());
        }

        return response;
    }
}

