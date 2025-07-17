package Strategy_Pattern.PaymentGetway_System.component;

@FunctionalInterface
public interface PaymentStrategy {

	void pay(double amount);
}
