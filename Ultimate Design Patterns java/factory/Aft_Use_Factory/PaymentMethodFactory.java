package factory.Aft_Use_Factory;

import factory.Aft_Use_Factory.CardTypes;



public class PaymentMethodFactory {

    public PaymentMethod createPaymentMethod(CardTypes cardType,String cardHolder,String cardNumber,String cvv,String expiryDate) {

        PaymentMethod paymentMethod = null;

        if (cardType == CardTypes.VISA) {

            return new Visa(cardHolder,cardNumber,cvv,expiryDate);

        } else if (cardType == CardTypes.MASTER_CARD) {

            return new MasterCard(cardHolder,cardNumber,cvv,expiryDate) ;

        }else if(cardType == CardTypes.AMERICAN_EXPRESS){

            return new AmericanExpress(cardHolder,cardNumber,cvv,expiryDate) ;

        }else {
            throw new IllegalArgumentException("Invalid Card Type");
        }

    }
}
