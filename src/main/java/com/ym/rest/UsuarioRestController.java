package com.ym.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ym.model.Usuario;
import com.ym.repo.IUsuarioRepo;

@RestController
@RequestMapping("/RestUsuario")
public class UsuarioRestController {

	
	@Autowired
	private IUsuarioRepo repo;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@GetMapping
	public List<Usuario> listarUsuario(){
		return repo.findAll();
	}
	
	@PostMapping
	public void InsertUsuario(@RequestBody Usuario obj){
		repo.save(obj);
	}
	
	@PutMapping
	public void ModificarUsuario(@RequestBody Usuario obj){
		//String passEncode = obj.getPassword();
		//obj.setPassword(encoder.encode(passEncode));
		repo.save(obj);
	}

	@DeleteMapping(value= "/{id}")
	public void DeleteUsuario(@PathVariable("id")Integer id){
		repo.deleteById(id);
	}

}
