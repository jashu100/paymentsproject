package com.dbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.beans.message;
import com.dbs.repo.Messagerepo;

@Service
public class Messageservice implements IMessageservice {

	@Autowired
	Messagerepo messagerepo;
	


	@Override
	public message findByMsgcode(String message_code) {
		// TODO Auto-generated method stub
		return messagerepo.findById(message_code).get();
	}

}
