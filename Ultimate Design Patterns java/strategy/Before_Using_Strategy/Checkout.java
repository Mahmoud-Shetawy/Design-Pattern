package strategy.Before_Using_Strategy;

public class Checkout {

    public void processPayment(double payment, PaymentMethod paymentMethod) {
        if (paymentMethod.equals(PaymentMethod.VISA_CARD)) {
            System.out.println("Processing Visa Card Payment");
            System.out.println("Calculating fees of amount for Visa Card Payment");
        } else if (paymentMethod .equals(PaymentMethod.PAYPAL)) {
            System.out.println("Processing PAYPALPayment");
            System.out.println("Calculating fees of amount for PAYPAL Payment");
        }else if (paymentMethod.equals(PaymentMethod.BANK_TRANSFER)) {
            System.out.println("Processing Bank Transfer");
            System.out.println("Calculating fees of amount for Bank Transfer");
        }
    }
}
