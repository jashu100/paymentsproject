package com.dbs.beans;

public class Responsebody {
	private String message;
	private String description;
	public Responsebody() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Responsebody(String message, String description) {
		super();
		this.message = message;
		this.description = description;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Responsebody [message=" + message + ", description=" + description + "]";
	}
	

}
