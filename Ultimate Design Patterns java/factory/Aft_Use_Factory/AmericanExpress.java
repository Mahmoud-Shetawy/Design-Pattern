package factory.Aft_Use_Factory;

public class AmericanExpress extends PaymentMethod {
    public AmericanExpress(String cardType, String expiryDate, String cardHolder, String cvv) {
        super(cardType, expiryDate, cardHolder, cvv);
    }

    @Override
    public void authorize() {
        System.out.println("authorize American_Express ...");
    }

    @Override
    public void startMoneyTransfer() {
        System.out.println("startMoneyTransfer American_Express ...");
    }

    @Override
    public void calculatePaymentFees(double amount) {
        System.out.println("calculatePaymentFees American_Express  ");
    }
}
