package com.dbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.beans.Receiver;
import com.dbs.repo.Receiverepo;
@Service
public class ReceiverService implements IReceiverService {
	
	@Autowired
	Receiverepo receiverepo;
	

	@Override
	public Receiver findByBic(String BIC) {
		// TODO Auto-generated method stub
		 return receiverepo.findById(BIC).get();
	}

}
