package com.pegasus.access.infrastructure.adapter.inboud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pegasus.access.infrastructure.port.inbound.IUserPort;

import lombok.RequiredArgsConstructor;



@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
	
	@Autowired
	private IUserPort userPort;
	
	@GetMapping("/obtener-usuario")
	public String getUser() {
		return this.userPort.getUserById();
	}
	
}
