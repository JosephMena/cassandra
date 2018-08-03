package org.zer0.pocs.cassandrademo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.zer0.pocs.cassandrademo.dto.Persona;
import org.zer0.pocs.cassandrademo.repositorios.PersonaRepositorio;

@RestController
public class TestController {

	@Autowired
	private PersonaRepositorio repositorioPersona;
	
	@RequestMapping("/persona")
	public Persona getPersona(@RequestParam("id") String id) {
		Persona p=new Persona();
		p.setDni(42568871);
		p.setNombres("Cesar");
		p.setApellidos("Perez");
		repositorioPersona.insert(p);
		return new Persona();
	}
}
