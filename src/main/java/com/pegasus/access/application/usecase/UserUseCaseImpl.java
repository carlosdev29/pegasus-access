package com.pegasus.access.application.usecase;

import org.springframework.stereotype.Service;

import com.pegasus.access.infrastructure.port.inbound.IUserPort;


@Service
public class UserUseCaseImpl implements IUserPort {

	@Override
	public String getUserById() {
		return "Carlos Sanz";
	}

}
