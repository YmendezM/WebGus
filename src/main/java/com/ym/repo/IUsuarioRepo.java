package com.ym.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ym.model.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer> {
	
	Usuario findByNombre(String Nombre); // esto es una consulta por nombre

}
