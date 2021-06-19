package com.ym.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ym.model.Usuario;
import com.ym.repo.IUsuarioRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsuarioTestUnit {
	
	@Autowired
	private IUsuarioRepo repo;
	
	@Test
	public void crearUsuarioTest(){
		Usuario us = new Usuario();
		us.setId(2);
		us.setNombre("ely");
		us.setPassword("123456");
		Usuario retorno = repo.save(us);
		assertTrue(retorno.getPassword().equalsIgnoreCase(us.getPassword()));
	}
	

}