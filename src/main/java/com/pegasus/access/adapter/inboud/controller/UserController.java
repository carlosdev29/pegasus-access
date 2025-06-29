package com.pegasus.access.adapter.inboud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {
	
	@GetMapping("/obtener-usuario")
	public String getUser() {
		return "Hola Carlos";
	}
}
