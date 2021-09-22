package com.dbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.beans.message;
import com.dbs.service.IMessageservice;

@RestController
public class Messagecontroller {
	
	@Autowired
	IMessageservice messageservice;
	
	
	
	@GetMapping(value="message/{id}")
	public ResponseEntity<message> getmessage(@PathVariable("id") String message_code) {
		message mess = messageservice.findByMsgcode(message_code);
		return new ResponseEntity<>(mess, HttpStatus.OK);
	}

}
