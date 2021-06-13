package com.ym.rest;

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

import com.ym.model.Persona;
import com.ym.repo.IPersonaRepo;

@RestController
@RequestMapping("/RestPersona")
public class PersonaRestController {
	
	@Autowired
	private IPersonaRepo repo;
	
	@GetMapping
	public List<Persona> listarPersonas(){
		return repo.findAll();
	}
	
	@PostMapping
	public void InsertPersonas(@RequestBody Persona obj){
		repo.save(obj);
	}
	
	@PutMapping
	public void ModificarPersonas(@RequestBody Persona obj){
		repo.save(obj);
	}

	@DeleteMapping(value= "/{id}")
	public void DeletePersonas(@PathVariable("id")Integer id){
		repo.deleteById(id);
	}



}
