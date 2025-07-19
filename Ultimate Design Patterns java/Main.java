import factory.Aft_Use_Factory.CardTypes;
import factory.Aft_Use_Factory.PaymentMethodFactory;
import factory.Aft_Use_Factory.PaymentProcessor;
//import factory.Bef_Use_Factory.PaymentProcessor;

public class Main {
    public static void main(String[] args) {



/// Bef_Use_Factory
/*
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment("AMERICAN_EXPRESS",1000,"1","SHETAWY","123","2-2-2025");
*/

/// Aft_Use_Factory

        PaymentProcessor paymentProcessor = new PaymentProcessor(new PaymentMethodFactory());
        paymentProcessor.processPayment(CardTypes.VISA,1000,
                "SHeto","123","212","2-2-2021");

    }
}