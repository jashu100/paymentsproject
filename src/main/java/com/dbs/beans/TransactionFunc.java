package com.dbs.beans;

public class TransactionFunc {
	
	String SenderAC;
	String sender_bic;
	String Receiverbic;
	String ReceiverAC;
	String Receivername;
	String Transfertype;
	String MessageCode;
	double Amount;
	
	
	public String getSenderAC() {
		return SenderAC;
	}


	public void setSenderAC(String senderAC) {
		SenderAC = senderAC;
	}


	public String getSender_bic() {
		return sender_bic;
	}


	public void setSender_bic(String sender_bic) {
		this.sender_bic = sender_bic;
	}


	public String getReceiverbic() {
		return Receiverbic;
	}


	public void setReceiverbic(String receiverbic) {
		Receiverbic = receiverbic;
	}


	public String getReceiverAC() {
		return ReceiverAC;
	}


	public void setReceiverAC(String receiverAC) {
		ReceiverAC = receiverAC;
	}


	public String getReceivername() {
		return Receivername;
	}


	public void setReceivername(String receivername) {
		Receivername = receivername;
	}


	public String getTransfertype() {
		return Transfertype;
	}


	public void setTransfertype(String transfertype) {
		Transfertype = transfertype;
	}


	public String getMessageCode() {
		return MessageCode;
	}


	public void setMessageCode(String messageCode) {
		MessageCode = messageCode;
	}


	public double getAmount() {
		return Amount;
	}


	public void setAmount(double amount) {
		Amount = amount;
	}

	

	public TransactionFunc() {
		super();
		// TODO Auto-generated constructor stub
	}


	public TransactionFunc(String senderAC, String sender_bic, String receiverbic, String receiverAC,
			String receivername, String transfertype, String messageCode, double amount) {
		super();
		SenderAC = senderAC;
		this.sender_bic = sender_bic;
		Receiverbic = receiverbic;
		ReceiverAC = receiverAC;
		Receivername = receivername;
		Transfertype = transfertype;
		MessageCode = messageCode;
		Amount = amount;
	}


	@Override
	public String toString() {
		return "TransactionFunc [SenderAC=" + SenderAC + ", sender_bic=" + sender_bic + ", Receiverbic=" + Receiverbic
				+ ", ReceiverAC=" + ReceiverAC + ", Receivername=" + Receivername + ", Transfertype=" + Transfertype
				+ ", MessageCode=" + MessageCode + ", Amount=" + Amount + "]";
	}
	
	

}
