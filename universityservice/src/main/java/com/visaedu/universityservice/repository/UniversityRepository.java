package com.visaedu.universityservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.visaedu.universityservice.model.University;

public interface UniversityRepository extends MongoRepository<University, String> {
}
