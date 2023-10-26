package com.katheprc.TrabajoPractico1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import com.katheprc.TrabajoPractico1.model.Profesor;

@Controller
@RequestMapping("/")
public class ProfesorController {

	@GetMapping("/")
	public String mostrarVista(Model model) {

		List<Profesor> listaProfesores = new ArrayList<>();

		Profesor profesor = new Profesor();
		profesor.setNombre("Kata");
		profesor.setMateria("Matematica");
		profesor.setTurno("Noche");
		
		Profesor profesor2 = new Profesor();
		profesor2.setNombre("Jonatan");
		profesor2.setMateria("Biologia");
		profesor2.setTurno("Mañana");
		
		Profesor profesor3 = new Profesor();
		profesor3.setNombre("Camila");
		profesor3.setMateria("Geografía");
		profesor3.setTurno("Tarde");

		listaProfesores.add(profesor);
		listaProfesores.add(profesor2);
		listaProfesores.add(profesor3);

		model.addAttribute("listaProfesores", listaProfesores);

		return "index.html";
	}

}
