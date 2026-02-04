package com.visaedu.visaeduapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.visaedu.visaeduapi.model.Program;
import com.visaedu.visaeduapi.repository.ProgramRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
public class ProgramController {
    private final ProgramRepository programRepository;
    
    @PostMapping("/create")
    public Program createProgram(@RequestBody Program program) {

        program.setId(null);

        return programRepository.save(program);
    }

    public ProgramController(ProgramRepository programRepository) {
        this.programRepository = programRepository;
    }

    // Get All Programs
    @GetMapping("/api/programs")
    public List<Program> getAllPrograms() {
        return programRepository.findAll();
    }
    
    
    
    @DeleteMapping("/api/programs/{id}")
    public String deleteProgram(@PathVariable("id") String id) {

        if (!programRepository.existsById(id)) {
            return "❌ Program not found with id: " + id;
        }

        programRepository.deleteById(id);

        return "✅ Program deleted successfully!";
    }
    
    



}
