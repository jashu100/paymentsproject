package com.dbs.service;

import com.dbs.beans.Customer;


public interface ICustomerService {

	

	Customer findByAccnum(String Customer_id);

	void updateCheckbalance(String acc_num, double amt);

}

