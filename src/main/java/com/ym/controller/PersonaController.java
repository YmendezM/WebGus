package com.ym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ym.model.Persona;
import com.ym.repo.IPersonaRepo;

@Controller
public class PersonaController {
	
	@Autowired
	private IPersonaRepo repo;
	
	//@Autowired
	//private BCryptPasswordEncoder encoder;
	
	@GetMapping("/persona")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		
		Persona p = new Persona();
		p.setIdPersona(1);
		p.setNombre("Montse Consentida");
		
		repo.save(p);
		
		model.addAttribute("name", name);
		return "greeting";
	}
	
	@GetMapping("/personaList")
	public String GetAllPersona(Model model) {
		
		model.addAttribute("persona", repo.findAll());
		return "greeting";
	}
}
