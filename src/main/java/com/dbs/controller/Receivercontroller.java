package com.dbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.beans.Receiver;
import com.dbs.service.IReceiverService;

@RestController
public class Receivercontroller {
	
	@Autowired
	IReceiverService receiverservice;
	
	@GetMapping(value="receiver/{id}")
	public ResponseEntity<Receiver> getCustomer(@PathVariable("id") String BIC) {
		Receiver receiver = receiverservice.findByBic(BIC);
		return new ResponseEntity<>(receiver, HttpStatus.OK);
	}
	

}
