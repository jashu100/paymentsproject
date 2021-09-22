package com.dbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.beans.Customer;
import com.dbs.service.ICustomerService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class Customercontroller {
	
	@Autowired
	ICustomerService customerservice;
	
	
	
	@GetMapping(value="customer/{id}")
	public ResponseEntity<Customer> getCustomer(@PathVariable("id") String Customer_id) {
		Customer customer = customerservice.findByAccnum(Customer_id);
		return new ResponseEntity<>(customer, HttpStatus.OK);
	}
	
	

}

