package com.example.universitysystem.repository;

import com.example.universitysystem.model.Curso;
import com.example.universitysystem.model.Departamento;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository<Curso, Long>{

	Departamento save(Departamento departamento);
	

}
