package com.visaedu.visaeduapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.visaedu.visaeduapi.model.University;

public interface UniversityRepository extends MongoRepository<University, String> {
}
