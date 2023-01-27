package com.wallet.api.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

public class OrderPaymentStatement {
	
	@Id
	private String paymentId;
	private String transactionType;
	private Double amount;
	private LocalDate date;
	
	//private EWallet ewallet;
	@Field
	private String walletId;

	//private String orderId;
	private String transactionRemarks;

	public OrderPaymentStatement(String paymentId, String transactionType, Double amount, LocalDate date,
			String walletId, String transactionRemarks) {
		super();
		this.paymentId = paymentId;
		this.transactionType = transactionType;
		this.amount = amount;
		this.date = date;
		this.walletId = walletId;
		this.transactionRemarks = transactionRemarks;
	}

	public OrderPaymentStatement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getWalletId() {
		return walletId;
	}

	public void setWalletId(String walletId) {
		this.walletId = walletId;
	}

	public String getTransactionRemarks() {
		return transactionRemarks;
	}

	public void setTransactionRemarks(String transactionRemarks) {
		this.transactionRemarks = transactionRemarks;
	}

	


}
