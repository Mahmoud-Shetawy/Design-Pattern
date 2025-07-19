package factory.Aft_Use_Factory;

public class PaymentProcessor {
  private PaymentMethodFactory paymentMethodFactory;

    public PaymentProcessor(PaymentMethodFactory paymentMethodFactory) {
        this.paymentMethodFactory = paymentMethodFactory;
    }

    public void processPayment(CardTypes cardType,double amount,String cardHolder,String cardNumber,String cvv,String expiryDate) {
        PaymentMethod paymentMethod = paymentMethodFactory
                .createPaymentMethod(cardType,cardHolder,cardNumber,cvv,expiryDate);

        paymentMethod.authorize();
        paymentMethod.startMoneyTransfer();
        paymentMethod.calculatePaymentFees(amount);

    }


}
