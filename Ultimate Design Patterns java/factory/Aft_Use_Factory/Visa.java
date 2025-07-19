package factory.Aft_Use_Factory;

public class Visa extends PaymentMethod {
    public Visa(String cardNumber, String cardHolder,String cvv,String expiryDate) {
        super(cardNumber, cardHolder,cvv, expiryDate);
    }

    @Override
    public void authorize() {
        System.out.println("authorize Visa Card ...");
    }

    @Override
    public void startMoneyTransfer() {
        System.out.println("startMoneyTransfer Visa Card ...");
    }

    @Override
    public void calculatePaymentFees(double amount) {
        System.out.println("calculatePaymentFees Visa Card ...");
    }

}
