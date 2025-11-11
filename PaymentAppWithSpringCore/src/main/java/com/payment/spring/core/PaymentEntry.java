package com.payment.spring.core;

public class PaymentEntry {
	
	private Payment payment;
	
	public PaymentEntry(Payment payment) {
		this.payment = payment;
	}
	
	public void makePayment(double amount) {
		boolean paymentFlag = payment.pay(amount);
		if(paymentFlag) {
			System.out.println("Payment done.");
		}else {
			System.out.println("Payment failed. Please try again.");
		}
	}

}
