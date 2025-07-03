package strategy.After_Using_Strategy;

public class BankTransferPaymentStrategy implements PaymentStrategy{


    @Override
    public void processPayment(double amount) {
        System.out.println("Processing  Payment of Bank Transfer ");
    }
}
