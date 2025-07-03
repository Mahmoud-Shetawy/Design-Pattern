//import observer.afterUseObserver.*;
//import strategy.Before_Using_Strategy.*;
import strategy.After_Using_Strategy.*;

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
     /*   OnlineMarketPlace onlineMarketPlace = new OnlineMarketPlace();
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
        onlineMarketPlace.addNewJobOpening("Developer");*/

        // bef_Use_Strategy
/*        Product wallet =new Product("Wallet",200.0);
        double walletPrice = wallet.calculatePrice(MemberShipType.REGULAR);
        System.out.println("Wallet Price is: " + walletPrice);

        Product jacket =new Product("jacket",100.0);
        double jacketPrice = jacket.calculatePrice(MemberShipType.GOLD);
        System.out.println("jacket Price is: " + jacketPrice);

        Product mobile =new Product("mobile",1000.0);
        double mobilePrice = mobile.calculatePrice(MemberShipType.GOLD);
        System.out.println("mobile Price is: " + mobilePrice);


        Checkout checkout=new Checkout();
        checkout.processPayment(walletPrice,PaymentMethod.VISA_CARD);
        checkout.processPayment(jacketPrice,PaymentMethod.PAYPAL);
        checkout.processPayment(mobilePrice,PaymentMethod.BANK_TRANSFER);*/


        // aft_Use_Strategy
        Product wallet =new Product("Wallet",200.0,new RegularPricingStrategy());
        double walletPrice = wallet.calculatePrice();
        System.out.println(walletPrice);

        Product jacket =new Product("jacket",100.0,new GoldPriceingStrategy());
        double jacketPrice = jacket.calculatePrice();
        System.out.println( jacketPrice);

        Product mobile =new Product("mobile",1000.0,new PremiumPriceingStrategy());
        double mobilePrice = mobile.calculatePrice();
        System.out.println(mobilePrice);


        Checkout visaCardCheckout = new Checkout(new VisaCardPaymentStrategy());
        visaCardCheckout.processPayment(walletPrice);

        Checkout paypalCheckout = new Checkout(new PaypalPaymentStrategy());
        paypalCheckout.processPayment(jacketPrice);

        Checkout BankCheckout = new Checkout(new BankTransferPaymentStrategy());
        BankCheckout.processPayment(mobilePrice);
    }
}