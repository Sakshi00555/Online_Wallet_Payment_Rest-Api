package com.paymentApp.module;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FundTransferDTO {
	
	private String targetMobileNo;
	
	private double amount;

	public String getTargetMobileNo() {
		return targetMobileNo;
	}

	public void setTargetMobileNo(String targetMobileNo) {
		this.targetMobileNo = targetMobileNo;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	
}

