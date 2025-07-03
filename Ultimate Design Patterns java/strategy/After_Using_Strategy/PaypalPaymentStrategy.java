package strategy.After_Using_Strategy;

public class PaypalPaymentStrategy implements PaymentStrategy{

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Paypal Payment");
        System.out.println("Calculating fees of amount "+ amount +" for Paypal Payment");
    }
}
