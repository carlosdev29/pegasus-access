package com.pegasus.access.infrastructure.adapter.inboud.dto;

import java.util.Objects;


//@Getter
public class UserRequestDTO {
	
	private String name;
	private String documentNumber;
	private String mail;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDocumentNumber() {
		return documentNumber;
	}
	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	@Override
	public int hashCode() {
		return Objects.hash(documentNumber, mail, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserRequestDTO other = (UserRequestDTO) obj;
		return Objects.equals(documentNumber, other.documentNumber) && Objects.equals(mail, other.mail)
				&& Objects.equals(name, other.name);
	}
	
	

}
