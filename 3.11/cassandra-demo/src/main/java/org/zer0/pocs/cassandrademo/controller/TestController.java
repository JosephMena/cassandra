package org.zer0.pocs.cassandrademo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.zer0.pocs.cassandrademo.dto.Persona;
import org.zer0.pocs.cassandrademo.repositorios.PersonaRepositorio;

@RestController
public class TestController {

	@Autowired
	private PersonaRepositorio repositorioPersona;
	
	@PostMapping(
		path="/persona",
		consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
		produces = {MediaType.APPLICATION_STREAM_JSON_VALUE,MediaType.APPLICATION_JSON_VALUE}
	)
	public Persona registrarPersona(@RequestBody Persona persona) {
		repositorioPersona.insert(persona);
		return persona;
	}
	
}
