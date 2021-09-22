package com.dbs.service;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.beans.Transaction;
import com.dbs.repo.Transactionrepo;

@Service
public class Transactionservice  {
	
	@Autowired
	Transactionrepo transactionrepo;
	
	@Autowired
	ICustomerService customerservice;
	
	@Autowired
	IMessageservice messageservice;
	
	@Autowired
	IReceiverService receiverservice;
	
	
	
   
	public Transaction findById(String Trans_id) {
		// TODO Auto-generated method stub
		return transactionrepo.findById(Trans_id).get();
	}

    
    public boolean checkBalance(String act_num,double amt)
	{
		double transaction_fee = (0.25/100)*amt;
		double total_amt_transfer = amt + transaction_fee;
		double clear_balance=customerservice.findByAccnum(act_num).getClear_balance();
		
		String check_overdraft = customerservice.findByAccnum(act_num).getOverdraft();
		
		if(total_amt_transfer < clear_balance)
		{
			return true;
		}
		else
		{
			if(check_overdraft.equals("yes"))
				return true;
			else
				return false;
		}
	}
		
	public boolean chechTransaferType(String ttype,String c_acct,String r_acct)
	{
	
		if(ttype.equals("o"))
		{
			String c_name = customerservice.findByAccnum(c_acct).getAccount_holder_name();
			String r_name = customerservice.findByAccnum(r_acct).getAccount_holder_name();
			
			boolean match1 = Pattern.matches("HDFC Bank[.]*", c_name);
			boolean match2 = Pattern.matches("HDFC Bank[.]*", r_name);
			
			if(match1 && match2)
				return true;
			else
				return false;
		
		}
		
		return true;
	}
	
	public Transaction insertTransaction(Transaction transaction)
	{
		return transactionrepo.save(transaction);
	}
}

