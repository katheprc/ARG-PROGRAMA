package com.katheprc.TPFINAL.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.katheprc.TPFINAL.service.EstudianteService;

@Controller
@RequestMapping("/")
public class MainController {

	@Autowired
	EstudianteService eSrv = new EstudianteService();

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("listaEstudiantes", eSrv.listar());
		return "index.html";
	}

	@PostMapping("/")
	public String editarId(@RequestParam("id") String id, @RequestParam("nombre") String nombre,
			@RequestParam("apellido") String apellido, @RequestParam("email") String email, Model model) {
		eSrv.guardar(Integer.parseInt(id), nombre, apellido, email);
		model.addAttribute("listaEstudiantes", eSrv.listar());
		return "index.html";
	}


	@PostMapping("/registroeliminado")
	public String eliminar(@RequestParam("id") String id, Model model) {
		eSrv.Eliminar(Integer.parseInt(id));
		model.addAttribute("listaEstudiantes", eSrv.listar());
		return "index.html";
	}
	
}
