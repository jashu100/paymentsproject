package com.dbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.beans.Customer;
import com.dbs.repo.Customerrepo;

// All operations asked by the business

@Service
public class Customerservice implements ICustomerService {
	
	@Autowired
	Customerrepo customerrepo;
	

	@Override
	public Customer findByAccnum(String Customer_id) {
		// TODO Auto-generated method stub
		return customerrepo.findById(Customer_id).get();
	}
    
	
	@Override
public void updateCheckbalance(String Customer_id,double amt) {
		
		Customer customer = findByAccnum(Customer_id);
		customer.setClear_balance(customer.getClear_balance() - amt);
		Customer c1 = customerrepo.save(customer);
		
	}
	



}
