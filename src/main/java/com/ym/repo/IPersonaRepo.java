package com.ym.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ym.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer> {

}
