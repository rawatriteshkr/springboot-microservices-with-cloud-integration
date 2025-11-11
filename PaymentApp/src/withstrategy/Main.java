package withstrategy;

public class Main {

	public static void main(String[] args) {
		
//		UPI payment
		PaymentEntry pe = new PaymentEntry(new UPIPayment());
		pe.makePayment(200);
		
//		Credit card payment
//		PaymentEntry pe = new PaymentEntry(new CreditCardPayment());
//		pe.makePayment(500);
		
//		Debit card payment
//		PaymentEntry pe = new PaymentEntry(new DebitCardPayment());
//		pe.makePayment(500);

	}

}
