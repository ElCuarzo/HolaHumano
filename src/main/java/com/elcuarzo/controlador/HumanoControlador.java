package com.elcuarzo.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanoControlador {
	
	@GetMapping("/")
	public String HolaHumano(String humano) {
		return "<h1> Hola Humano! </h1>";
	}
	
	@GetMapping("/{nombre}/{apellido}")
	public String HolaNombre(@PathVariable("nombre") String nombre,
							 @PathVariable("apellido") String apellido) {
		return "<h1> Hola " + nombre + " " + apellido + "!</h1>" ;
	}
}
