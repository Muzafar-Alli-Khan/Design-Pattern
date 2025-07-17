package Strategy_Pattern.PaymentGetway_System.Factory;

import Strategy_Pattern.PaymentGetway_System.component.PaymentStrategy;


public class PaymentService {

	private PaymentStrategy str;

	public void setStart(PaymentStrategy start) {
		this.str = start;
	}
	
	public  void makePayment(double amount) {
		
        if (str == null) {
            System.out.println("Please select a payment method first.");
        }
        
        else
        {
        	str.pay(amount);
        }
    }
 
}
