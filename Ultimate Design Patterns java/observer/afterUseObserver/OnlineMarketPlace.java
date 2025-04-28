package observer.afterUseObserver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OnlineMarketPlace {
    private Map<EventType,List<Subscriber>> subscribers;

    private List<Product> products;

    private List<Offer> offers;

    public OnlineMarketPlace() {
        this.subscribers = new HashMap<>();
        initSubscriberEvents();
        this.products = new ArrayList<>();
        this.offers = new ArrayList<>();
    }

    public void initSubscriberEvents() {
        subscribers.put(EventType.NEW_PRODUCT, new ArrayList<>());
        subscribers.put(EventType.NEW_OFFER, new ArrayList<>());
        subscribers.put(EventType.JOB_OPENING, new ArrayList<>());
    }


    public void subscribe(EventType eventType,Subscriber subscriber) {
        subscribers.get(eventType).add(subscriber);

    }


    // Add new product
    public void addNewProduct(Product product) {
        products.add(product);
        notifySubscribers(EventType.NEW_PRODUCT,"New Product is add : "+product.getName());
    }

    public void notifySubscribers(EventType eventType,String message) {
        subscribers.get(eventType).forEach(subscriber->subscriber.notify(message));

    }
    // Add new Offer

    public void addNewOffer(Offer offer) {
        offers.add(offer);
        notifySubscribers(EventType.NEW_OFFER,"New Offer is add : "+offer.getMessage());
    }
    public void addNewJobOpening(String jobTitle) {
        notifySubscribers(EventType.JOB_OPENING,"New opining position is available: "+jobTitle);
    }



    public void unSubscriber(EventType eventType, Subscriber subscriber) {
        subscribers.get(eventType).remove(subscriber);
    }




}
