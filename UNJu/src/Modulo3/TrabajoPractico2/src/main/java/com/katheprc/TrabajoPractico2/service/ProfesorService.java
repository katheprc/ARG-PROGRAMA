package com.katheprc.TrabajoPractico2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.katheprc.TrabajoPractico2.model.Profesor;
import com.katheprc.TrabajoPractico2.repository.ProfesorRepository;

@Service
public class ProfesorService {

	@Autowired
	ProfesorRepository pRepo;

	public List<Profesor> getAllProfes() {

		List<Profesor> listaProfesores = pRepo.findAll();

		return listaProfesores;

	}

	public Profesor updateProfesor(Profesor profe) {
		
		Profesor profesor = pRepo.findById(profe.getId());

		if(profe.getNombre() != null) {
			profesor.setNombre(profe.getNombre());
		}
		
		if(profe.getMateria() != null) {
			profesor.setMateria(profe.getMateria());

		}
		
		if(profe.getTurno() != null) {
			profesor.setTurno(profe.getTurno());

		}
		
		return pRepo.save(profesor);

	}

	
	public void guardarProfesor(Profesor profesor) {
		pRepo.save(profesor);
	}
	
	public void deleteProfe(int id) {
		pRepo.deleteById(id);
	}
}
