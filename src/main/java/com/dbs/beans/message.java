package com.dbs.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "message_code")
public class message {
	@Id
	String message_code;
	String description;
	
	public message() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public message(String message_code, String description) {
		super();
		this.message_code = message_code;
		this.description = description;
	}

	public String getMessage_code() {
		return message_code;
	}
	public void setMessage_code(String message_code) {
		this.message_code = message_code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
