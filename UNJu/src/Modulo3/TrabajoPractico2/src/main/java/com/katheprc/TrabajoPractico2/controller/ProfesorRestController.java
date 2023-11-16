package com.katheprc.TrabajoPractico2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.katheprc.TrabajoPractico2.model.Profesor;
import com.katheprc.TrabajoPractico2.service.ProfesorService;

@RestController
@RequestMapping("/")
public class ProfesorRestController {
	
	@Autowired
	ProfesorService pSrv = new ProfesorService();
	
	// getAllProfesores - @GetMapping 
	@GetMapping("/get/all")
	public List<Profesor> getAllProfesores(){
		
		List<Profesor> lista = pSrv.getAllProfes();
		
		return lista;
		
	}
	
	// getProfesorById - @GetMapping 
	@GetMapping("/get/{id}")
	public Profesor getProfesorById(@PathVariable int id){
		
		List<Profesor> lista = pSrv.getAllProfes();
		
		for(Profesor profe : lista) {
			if(profe.getId() == id) {
				return profe;
			}
		}
		
		return null;
		
	}
	
	// createProfesor - @PostMapping 
	@PostMapping("/create")
	public String createProfesor(@RequestBody() Profesor profesor) {
		
		pSrv.guardarProfesor(profesor);
		
		return "Profesor creado existosamente";
		
	}
	
	// updateProfesor - @PutMapping 
	@PutMapping("/update")
	public String updateProfesor(@RequestBody() Profesor profesor) {
		
		pSrv.updateProfesor(profesor);
		
		return "Profesor modificado con éxito";
	}
	
	// deleteProfesor - @DeleteMapping
	@DeleteMapping("/delete/{id}")
	public String deleteProfesor(@PathVariable int id) {
		
		pSrv.deleteProfe(id);
		
		return "Profesor eliminado exitosamente!";
		
	}
	

}
