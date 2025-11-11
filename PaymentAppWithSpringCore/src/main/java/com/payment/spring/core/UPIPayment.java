package com.payment.spring.core;

public class UPIPayment implements Payment {

	@Override
	public boolean pay(double amount) {
		System.out.println("UPI payment started...");
		return true;
	}

}
