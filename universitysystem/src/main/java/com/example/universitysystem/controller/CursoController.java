package com.example.universitysystem.controller;

import com.example.universitysystem.model.Curso;
import com.example.universitysystem.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {
	
	@Autowired
	private CursoRepository cursoRepository;
	
	@GetMapping
	public List<Curso> getAll(){
		return cursoRepository.findAll();
	}

	@PostMapping
	
public Curso create(@RequestBody Curso curso) {
		return cursoRepository.save(curso);
	}
}