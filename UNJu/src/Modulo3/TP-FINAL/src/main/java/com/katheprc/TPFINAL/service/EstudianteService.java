package com.katheprc.TPFINAL.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.katheprc.TPFINAL.dao.EstudianteRepoDAO;
import com.katheprc.TPFINAL.model.Estudiante;

@Service
public class EstudianteService {

	@Autowired
	EstudianteRepoDAO eRepo;

	public List<Estudiante> listar() {
		return eRepo.findAll();
	}

	@Transactional
	public void Eliminar(Integer id) {
		try {
			eRepo.deleteById(id);
		} catch (Exception e) {
			e.fillInStackTrace();
		}
	}

	@Transactional
	public void guardar(Integer id, String nombre, String apellido, String email) {

		boolean encontrado = false;
		
		for(Estudiante estudiante : listar()) {
			if (nombre.equals(estudiante.getNombre()) && apellido.equals(estudiante.getApellido()) && email.equals(estudiante.getEmail())) {
				encontrado = true;
				break;
			}
		}
		
		if (id == -1 && !encontrado) {
			Estudiante est = new Estudiante();
			est.setNombre(nombre);
			est.setApellido(apellido);
			est.setEmail(email);
			eRepo.save(est);
		} else if (!encontrado){
			Estudiante est = eRepo.findById(id).get();

			est.setNombre(nombre);
			est.setApellido(apellido);
			est.setEmail(email);

			eRepo.save(est);
		}

	}

}
