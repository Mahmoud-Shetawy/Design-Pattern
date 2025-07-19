package factory.Bef_Use_Factory;

public abstract class PaymentMethod {
    private String cardNumber;
    private String expiryDate;
    private String cardHolder;
    private String cvv;

    public PaymentMethod(String cardNumber, String expiryDate, String cardHolder, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cardHolder = cardHolder;
        this.cvv = cvv;
    }

    public abstract void authorize();
    public abstract void startMoneyTransfer();
    public abstract void calculatePaymentFees(double amount);

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
}
