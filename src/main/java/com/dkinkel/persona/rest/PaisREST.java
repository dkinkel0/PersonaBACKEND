package com.dkinkel.persona.rest;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dkinkel.persona.model.Pais;
import com.dkinkel.persona.service.PaisService;

@RestController
// se utiliza para definir controladores que manejan solicitudes HTTP y
// devuelven respuestas en formato JSON o XML

@RequestMapping("/pais/")
// Permite definir la ruta y el tipo de solicitud (GET, POST, PUT, DELETE, etc.)
// que un método debe manejar.

public class PaisREST {
	@Autowired
	private PaisService paisService;

	@GetMapping //Ante peticiones get se va a fijar aca
	private ResponseEntity<List<Pais>> getAllPais() {
		return ResponseEntity.ok(paisService.findAll());
	}
}
