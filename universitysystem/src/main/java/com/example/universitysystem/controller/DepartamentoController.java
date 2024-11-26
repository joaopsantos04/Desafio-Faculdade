package com.example.universitysystem.controller;


import com.example.universitysystem.model.Curso;
import com.example.universitysystem.model.Departamento;
import com.example.universitysystem.repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departamentos")
public class DepartamentoController {
	
	@Autowired
	private DepartamentoRepository departamentoRepository;
	
	@GetMapping
	public List<Curso> getAll(){
		return departamentoRepository.findAll();
	}

	@PostMapping
	
public Departamento create(@RequestBody Departamento departamento) {
		return departamentoRepository.save(departamento);
	}

}
