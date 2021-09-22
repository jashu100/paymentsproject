package com.dbs.service;

import com.dbs.beans.Receiver;

public interface IReceiverService {
	
	
	Receiver findByBic(String BIC);

}
