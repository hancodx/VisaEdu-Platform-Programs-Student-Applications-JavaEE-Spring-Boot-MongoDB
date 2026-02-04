package com.visaedu.visaeduapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.visaedu.visaeduapi.model.Student;

public interface StudentRepository extends MongoRepository<Student, String> {
}
