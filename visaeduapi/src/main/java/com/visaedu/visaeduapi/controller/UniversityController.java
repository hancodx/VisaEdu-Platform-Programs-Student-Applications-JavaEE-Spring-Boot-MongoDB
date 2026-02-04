package com.visaedu.visaeduapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.visaedu.visaeduapi.model.University;
import com.visaedu.visaeduapi.repository.UniversityRepository;

@RestController
public class UniversityController {

    private final UniversityRepository universityRepository;

    public UniversityController(UniversityRepository universityRepository) {
        this.universityRepository = universityRepository;
    }

    // Get All Universities
    @GetMapping("/api/universities")
    public List<University> getAllUniversities() {
        return universityRepository.findAll();
    }
}
