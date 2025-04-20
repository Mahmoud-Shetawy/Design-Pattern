import solid.AmericanExpressPaymentStrategy;
import solid.Order;
import solid.PaymentProcessor;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getLogger("MyLogger");

        PaymentProcessor paymentProcessor = new PaymentProcessor(new AmericanExpressPaymentStrategy());
        paymentProcessor.processPayment(new Order());

        // Retrieve the same Logger instance again
        Logger logger2 = Logger.getLogger("MyLogger");
        System.out.println(logger1 == logger2); // Output: true

    }
}