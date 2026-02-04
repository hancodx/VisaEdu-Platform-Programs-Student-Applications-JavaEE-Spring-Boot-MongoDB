package com.visaedu.visaeduapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.visaedu.visaeduapi.model.Program;

public interface ProgramRepository extends MongoRepository<Program, String> {
}
