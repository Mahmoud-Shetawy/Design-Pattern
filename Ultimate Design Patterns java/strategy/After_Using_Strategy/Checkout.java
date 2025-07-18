package strategy.After_Using_Strategy;

public class Checkout {
    private final PaymentStrategy paymentStrategy;


    public Checkout(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }


    public void processPayment(double amount) {
        paymentStrategy.processPayment(amount);
    }
}
