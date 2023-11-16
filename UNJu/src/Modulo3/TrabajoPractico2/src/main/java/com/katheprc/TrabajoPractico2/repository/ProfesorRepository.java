package com.katheprc.TrabajoPractico2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.katheprc.TrabajoPractico2.model.Profesor;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Integer>{
	
	@Query("SELECT p FROM Profesor p where p.id = :id")
	public Profesor findById(@Param("id") int id);
	
}

