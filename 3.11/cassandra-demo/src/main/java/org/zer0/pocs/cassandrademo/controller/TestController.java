package org.zer0.pocs.cassandrademo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.zer0.pocs.cassandrademo.dto.Persona;
import org.zer0.pocs.cassandrademo.repositorios.PersonaRepositorio;

import io.reactivex.Single;

@RestController
public class TestController {

	@Autowired
	private PersonaRepositorio repositorioPersona;
	
	@PostMapping(
		path="/persona",
		consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
		produces = {MediaType.APPLICATION_STREAM_JSON_VALUE,MediaType.APPLICATION_JSON_VALUE}
	)
	public Single<Persona> registrarPersona(@RequestBody Persona persona) {
		Single<Persona> s=repositorioPersona.save(persona);
		return s;
	}
	
}
