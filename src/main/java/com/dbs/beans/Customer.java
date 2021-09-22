package com.dbs.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="customer")
public class Customer {
	@Id
	String Customer_id;
	String Account_holder_name;
	Double Clear_balance;
	String Overdraft;
	
	
	public String getOverdraft() {
		return Overdraft;
	}
	public void setOverdraft(String overdraft) {
		Overdraft = overdraft;
	}
	public Customer(String customer_id, String account_holder_name, Double clear_balance) {
		super();
		Customer_id = customer_id;
		Account_holder_name = account_holder_name;
		Clear_balance = clear_balance;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getCustomer_id() {
		return Customer_id;
	}
	public void setCustomer_id(String customer_id) {
		Customer_id = customer_id;
	}
	public String getAccount_holder_name() {
		return Account_holder_name;
	}
	public void setAccount_holder_name(String account_holder_name) {
		Account_holder_name = account_holder_name;
	}
	public Double getClear_balance() {
		return Clear_balance;
	}
	public void setClear_balance(Double clear_balance) {
		Clear_balance = clear_balance;
	}
	
	
}
	
	

	
