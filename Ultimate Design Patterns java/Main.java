//import Builder.MessengerNotification;
//import Builder.MessengerNotificationBuilder;
import Builder.SlackNotification;
import Builder.SlackNotificationBuildr;
//import factory.Aft_Use_Factory.CardTypes;
//import factory.Aft_Use_Factory.PaymentMethodFactory;
//import factory.Aft_Use_Factory.PaymentProcessor;

import java.util.List;
//import factory.Bef_Use_Factory.PaymentProcessor;

public class Main {
    public static void main(String[] args) {


//
///// Bef_Use_Factory
///*
//        PaymentProcessor paymentProcessor = new PaymentProcessor();
//        paymentProcessor.processPayment("AMERICAN_EXPRESS",1000,"1","SHETAWY","123","2-2-2025");
//*/
//
///// Aft_Use_Factory
//
//        PaymentProcessor paymentProcessor = new PaymentProcessor(new PaymentMethodFactory());
//        paymentProcessor.processPayment(CardTypes.PAYPAL,1000,
//                "SHeto","123","212","2-2-2021");


//        MessengerNotification messengerNotification = new MessengerNotificationBuilder().setTheme("Dark").setContent("Hello World!").setSender("Sheto")
//                .setAttachments(List.of("image","icon")).setTimestamp("2025-012-").setRecipient("Sheto").build();
//
//        System.out.println(messengerNotification.getAttachments());

        SlackNotification slackNotification = new SlackNotificationBuildr().setTheme("Dark").setContent("Hello World!").setSender("Sheto")
                .setAttachments(List.of("image","icon")).setTimestamp("2025-012-").setRecipient("Sheto").build();

//        SlackNotification slackNotification = new SlackNotificationBuildr().setTheme("Dark").setAttachments(List.of("w1","w2")).setContent("New notif")
//                .setTimestamp("22-22-22-2").setSender("ali").setRecipient("wewew").build();

        System.out.println(slackNotification.getRecipient());
    }
}