package com.payment.spring.core;

public class CreditCardPayment implements Payment {

	@Override
	public boolean pay(double amount) {
		System.out.println("Credit card payment started...");
		return false;
	}

}
