package com.example.universitysystem.controller;

import com.example.universitysystem.model.Professor;
import com.example.universitysystem.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professores")
public class ProfessorController {
	
	@Autowired
	private ProfessorRepository professorRepository;
	
	@GetMapping
	public List<Professor> getAll(){
		return professorRepository.findAll();
	}

	@PostMapping
	
public Professor create(@RequestBody Professor professor) {
		return professorRepository.save(professor);
	}
}

