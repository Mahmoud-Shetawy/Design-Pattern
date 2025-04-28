import observer.afterUseObserver.*;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {


        //sold
        /*
        Logger logger1 = Logger.getLogger("MyLogger");
        // Retrieve the same Logger instance again
        Logger logger2 = Logger.getLogger("MyLogger");
        System.out.println(logger1 == logger2); // Output: true

        PaymentProcessor paymentProcessor = new PaymentProcessor(new AmericanExpressPaymentStrategy());
        paymentProcessor.processPayment(new Order());
        * */

        //bef_Use_observer
        /*
        OnlineMarketPlace marketPlace = new OnlineMarketPlace();
        marketPlace.addUser(new Customer("Ahmed",true,true));
        marketPlace.addUser(new Customer("Ali",true,false));
        marketPlace.addUser(new Customer("Mahmoud",false,true));
        marketPlace.addUser(new Customer("Mostafa",false,false));
        marketPlace.addNewProduct(new Product("Laptop",20000));
        marketPlace.addNewOffer(new Offer("New offer with 20% discount for every items."));
        */
        //Aft_Use_observer
        OnlineMarketPlace onlineMarketPlace = new OnlineMarketPlace();
        Subscriber Mahmoud = new Customer("Mahmoud");
        Subscriber Shetawy = new Customer("Shetawy");
        Subscriber mostafa = new Customer("mostafa");
        Subscriber Ali = new JobFinder("Ali");

        onlineMarketPlace.subscribe(EventType.NEW_PRODUCT, Mahmoud);

        onlineMarketPlace.subscribe(EventType.NEW_OFFER, Shetawy);

        onlineMarketPlace.subscribe(EventType.NEW_PRODUCT, Shetawy);

        onlineMarketPlace.subscribe(EventType.JOB_OPENING, Ali);

        onlineMarketPlace.addNewProduct(new Product("Laptop",20000));
        onlineMarketPlace.addNewOffer(new Offer("offer with 20% discount for every items."));
        onlineMarketPlace.addNewJobOpening("Developer");

    }
}