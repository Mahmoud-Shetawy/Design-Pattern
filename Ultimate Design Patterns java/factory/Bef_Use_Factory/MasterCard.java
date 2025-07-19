package factory.Bef_Use_Factory;

public class MasterCard extends PaymentMethod{
    public MasterCard(String cardNumber, String expiryDate, String cardHolder, String cvv) {
        super(cardNumber, expiryDate, cardHolder, cvv);
    }

    @Override
    public void authorize() {
        System.out.println("authorize MASTER Card ...");
    }

    @Override
    public void startMoneyTransfer() {
        System.out.println("startMoneyTransfer Master Card ...");
    }

    @Override
    public void calculatePaymentFees(double amount) {
        System.out.println("calculatePaymentFees MASTER Card ...");
    }


}
