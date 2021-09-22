package com.dbs.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.beans.Responsebody;
import com.dbs.beans.Transaction;
import com.dbs.beans.TransactionFunc;
import com.dbs.service.ICustomerService;
import com.dbs.service.IMessageservice;
import com.dbs.service.IReceiverService;
import com.dbs.service.Transactionservice;

@RestController
public class Transactioncontroller {
	
	@Autowired
	Transactionservice transactionservice;
	
	@Autowired
	ICustomerService customerservice;
	
	@Autowired
	IMessageservice messageservice;
	
	@Autowired
	IReceiverService receiverservice;
	
	@GetMapping(value="transaction/{id}")
	public ResponseEntity<Transaction> getCustomer(@PathVariable("id") String id) {
		Transaction transaction = transactionservice.findById(id);
		return new ResponseEntity<>(transaction, HttpStatus.OK);
	}
	
	@PostMapping(value="transaction")
	public ResponseEntity<Object> processingTransaction(@RequestBody TransactionFunc transactionfunc)
	{
		if(customerservice.findByAccnum(transactionfunc.getSenderAC())!= null)
		{
			if(receiverservice.findByBic(transactionfunc.getReceiverbic())!=null)
			{
					if(transactionservice.chechTransaferType(transactionfunc.getTransfertype(), transactionfunc.getSenderAC(),transactionfunc.getReceiverAC()))
					{
						if(transactionservice.checkBalance(transactionfunc.getSenderAC(), transactionfunc.getAmount()))
						{
							double total_money_deduct = transactionfunc.getAmount()+(0.25/100)*transactionfunc.getAmount();
							customerservice.updateCheckbalance(transactionfunc.getSenderAC(), total_money_deduct);
							
							Transaction transaction = new Transaction();
							
							transaction.setCustomer(customerservice.findByAccnum(transactionfunc.getSenderAC()));
							transaction.setTransfertype(transactionfunc.getTransfertype());
							transaction.setMessage(messageservice.findByMsgcode(transactionfunc.getMessageCode()));
							transaction.setReceiver(receiverservice.findByBic(transactionfunc.getReceiverbic()));
							transaction.setAmount(total_money_deduct);
							transaction.setReceivername(transactionfunc.getReceivername());
							transaction.setReceiverAC(transactionfunc.getReceiverAC());
							transaction.setDateTime(LocalDateTime.now());
							Transaction t1 = transactionservice.insertTransaction(transaction);
							return new ResponseEntity<>(t1,HttpStatus.OK);
							
						}
						else
						{
							return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new Responsebody("failure","Hey buddy you dont have enough balance to do this transaction "));
						}
					}
					else
					{
						return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new Responsebody("failure","Invalid transfer type or receiver account number "));
						
					}
				}
				
				
				else
				{
					return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new Responsebody("failure","Danger!! Receiver account is blacklisted"));
				}
	
		}
		else
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new Responsebody("failure","Customer does not exist"));
		}
		//return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new Responsebody("failure","Transaction failed"));
	}

}
