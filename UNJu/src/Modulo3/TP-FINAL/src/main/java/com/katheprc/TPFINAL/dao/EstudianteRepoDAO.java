package com.katheprc.TPFINAL.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.katheprc.TPFINAL.model.Estudiante;

@Repository
public interface EstudianteRepoDAO extends JpaRepository<Estudiante, Integer> {

}
