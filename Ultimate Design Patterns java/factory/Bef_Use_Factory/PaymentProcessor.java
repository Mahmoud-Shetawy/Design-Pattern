package factory.Bef_Use_Factory;

public class PaymentProcessor {
    public void processPayment(String cardType,double amount,String cardNumber,String cardHolder,String cvv,String expiryDate) {

        PaymentMethod paymentMethod = null;

        if (cardType.equalsIgnoreCase(CardTypes.VISA.toString())) {

            paymentMethod = new Visa(cardHolder,cardNumber,cvv,expiryDate);

        } else if (cardType.equalsIgnoreCase(CardTypes.MASTER_CARD.toString())) {

            paymentMethod = new MasterCard(cardHolder,cardNumber,cvv,expiryDate) ;

        }else if(cardType.equalsIgnoreCase(CardTypes.AMERICAN_EXPRESS.toString())){

            paymentMethod = new AmericanExpress(cardHolder,cardNumber,cvv,expiryDate) ;

        }else {
            throw new IllegalArgumentException("Invalid Card Type");
        }

        paymentMethod.authorize();
        paymentMethod.startMoneyTransfer();
        paymentMethod.calculatePaymentFees(amount);

    }


}
