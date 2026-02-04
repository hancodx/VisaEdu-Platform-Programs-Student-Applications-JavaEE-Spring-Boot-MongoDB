package com.visaedu.visaeduapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.visaedu.visaeduapi.model.Student;
import com.visaedu.visaeduapi.repository.StudentRepository;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentRepository repository;

    public StudentController(StudentRepository repository) {
        this.repository = repository;
    }

    // GET ALL Students
    @GetMapping
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    // GET Student by ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable String id) {
        return repository.findById(id).orElse(null);
    }
}
