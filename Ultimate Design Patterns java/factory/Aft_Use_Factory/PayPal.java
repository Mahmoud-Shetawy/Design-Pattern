package factory.Aft_Use_Factory;

public class PayPal extends PaymentMethod {
    public PayPal(String cardNumber, String expiryDate, String cardHolder, String cvv) {
        super(cardNumber, expiryDate, cardHolder, cvv);
    }

    @Override
    public void authorize() {
        System.out.println("PayPal Authorize");
    }

    @Override
    public void startMoneyTransfer() {
        System.out.println("PayPal StartMoneyTransfer");
    }

    @Override
    public void calculatePaymentFees(double amount) {
        System.out.println("PayPal CalculatePaymentFees");
    }
}
