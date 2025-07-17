package Strategy_Pattern.PaymentGetway_System.Tester;

import Strategy_Pattern.PaymentGetway_System.Factory.PaymentService;
import Strategy_Pattern.PaymentGetway_System.component.PaymentStrategy;

public class Tester {

	public static void main(String[] args) {
		
		PaymentStrategy  UpiPayment = amount ->System.out.println("Paid ₹" + amount + " using UPI.");
		PaymentStrategy  CreditCardPayment = amount ->System.out.println("Paid ₹" + amount + " using CreditCardPayment.");
		PaymentStrategy  NetBankingPayment = amount ->System.out.println("Paid ₹" + amount + " using NetBankingPayment");
		
		
		PaymentService pay = new PaymentService();
		pay.setStart(NetBankingPayment);
		pay.makePayment(100);
		pay.setStart(CreditCardPayment);
		pay.makePayment(100);
		pay.setStart(UpiPayment);
		pay.makePayment(100);
	}
}
