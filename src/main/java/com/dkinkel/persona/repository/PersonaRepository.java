package com.dkinkel.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dkinkel.persona.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
