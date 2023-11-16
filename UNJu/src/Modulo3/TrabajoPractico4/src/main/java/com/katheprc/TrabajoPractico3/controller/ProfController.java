package com.katheprc.TrabajoPractico3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.katheprc.TrabajoPractico3.model.Profesor;
import com.katheprc.TrabajoPractico3.service.ProfesorService;

@Controller
@RequestMapping("/")
public class ProfController {

	@Autowired
	ProfesorService pSrv = new ProfesorService();
	
	@GetMapping("/")
	public String listar(Model model) {

		List<Profesor> listaProf = pSrv.getAllProfes();

		model.addAttribute("listaProf", listaProf);

		return "index.html";
	}

}
