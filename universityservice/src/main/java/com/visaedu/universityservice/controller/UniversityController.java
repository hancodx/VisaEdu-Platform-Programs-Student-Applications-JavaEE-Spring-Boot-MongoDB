package com.visaedu.universityservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.visaedu.universityservice.model.University;
import com.visaedu.universityservice.repository.UniversityRepository;

@RestController
@RequestMapping("/api/universities")
public class UniversityController {

	private final UniversityRepository universityRepository;

    public UniversityController(UniversityRepository universityRepository) {
        this.universityRepository = universityRepository;
    }

    // GET ALL UNIVERSITIES
    @GetMapping
    public List<University> getAllUniversities() {
        return universityRepository.findAll();
    }
}
