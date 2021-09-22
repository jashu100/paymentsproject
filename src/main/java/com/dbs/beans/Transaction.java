package com.dbs.beans;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "transaction")
public class Transaction {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	String Trans_id;
	String Transfertype;
	double Amount;
	String ReceiverAC;
	LocalDateTime DateTime;
	String Receivername;
	@ManyToOne
	@JoinColumn(name="SenderAC")
	Customer customer;
	@ManyToOne
	@JoinColumn(name="Receiverbic")
	Receiver receiver;
	@ManyToOne
	@JoinColumn(name="MessageCode")
	message message;
	public Transaction(String trans_id, String transfertype, double amount, String receiverAC, LocalDateTime dateTime,
			String receivername, Customer customer, Receiver receiver, com.dbs.beans.message message) {
		super();
		Trans_id = trans_id;
		Transfertype = transfertype;
		Amount = amount;
		ReceiverAC = receiverAC;
		DateTime = dateTime;
		Receivername = receivername;
		this.customer = customer;
		this.receiver = receiver;
		this.message = message;
	}
	public String getTrans_id() {
		return Trans_id;
	}
	public void setTrans_id(String trans_id) {
		Trans_id = trans_id;
	}
	public String getTransfertype() {
		return Transfertype;
	}
	public void setTransfertype(String transfertype) {
		Transfertype = transfertype;
	}
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double amount) {
		Amount = amount;
	}
	public String getReceiverAC() {
		return ReceiverAC;
	}
	public void setReceiverAC(String receiverAC) {
		ReceiverAC = receiverAC;
	}
	public LocalDateTime getDateTime() {
		return DateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		DateTime = dateTime;
	}
	public String getReceivername() {
		return Receivername;
	}
	public void setReceivername(String receivername) {
		Receivername = receivername;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Receiver getReceiver() {
		return receiver;
	}
	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}
	public message getMessage() {
		return message;
	}
	public void setMessage(message message) {
		this.message = message;
	}
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Transaction [Trans_id=" + Trans_id + ", Transfertype=" + Transfertype + ", Amount=" + Amount
				+ ", ReceiverAC=" + ReceiverAC + ", DateTime=" + DateTime + ", Receivername=" + Receivername
				+ ", customer=" + customer + ", receiver=" + receiver + ", message=" + message + "]";
	}
	

	
}
