package strategy.After_Using_Strategy;

public class VisaCardPaymentStrategy implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Visa Card Payment");
        System.out.println("Calculating fees of amount "+ amount +" for Visa Card Payment");
    }
}
