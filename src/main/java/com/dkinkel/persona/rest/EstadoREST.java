package com.dkinkel.persona.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dkinkel.persona.model.Estado;
import com.dkinkel.persona.service.EstadoService;

@RestController
@RequestMapping("/estado")

public class EstadoREST {
	// creo una instancia de EstadoService
	@Autowired
	private EstadoService estadoService;

	// mapeo con un parametro llamado despues la linkeo con la entrada del metodo
	// getAllEstadoByPais
	@GetMapping("{id}")
	private ResponseEntity<List<Estado>> getAllEstadoByPais(@PathVariable("id") Long idPais) {
		return ResponseEntity.ok(estadoService.findAllByCountry(idPais));
		// ResponseEntity es una clase en Spring Framework que representa toda la
		// respuesta HTTP, incluyendo el cuerpo, los encabezados y el estado

	}

}
