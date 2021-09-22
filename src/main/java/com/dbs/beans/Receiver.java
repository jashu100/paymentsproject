package com.dbs.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "receiver")
public class Receiver {
	@Id
	String BIC;
	String institution_name;
	
	public Receiver() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Receiver(String bIC, String institution_name) {
		super();
		BIC = bIC;
		this.institution_name = institution_name;
	}

	public String getBIC() {
		return BIC;
	}
	public void setBIC(String bIC) {
		BIC = bIC;
	}
	public String getInstitution_name() {
		return institution_name;
	}
	public void setInstitution_name(String institution_name) {
		this.institution_name = institution_name;
	}
	

}
