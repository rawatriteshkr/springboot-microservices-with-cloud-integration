package withstrategy;

public class DebitCardPayment implements Payment {

	@Override
	public boolean pay(double amount) {
		System.out.println("Debit card payment started...");
		return true;
	}

}
