package com.example.universitysystem.controller;

import com.example.universitysystem.model.Alunos;
import com.example.universitysystem.repository.AlunosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunosController {
	
	@Autowired
	private AlunosRepository alunosRepository;
	
	@GetMapping
	public List<Alunos> getAll(){
		return alunosRepository.findAll();
	}

	@PostMapping
	
public Alunos create(@RequestBody Alunos alunos) {
		return alunosRepository.save(alunos);
	}
}

