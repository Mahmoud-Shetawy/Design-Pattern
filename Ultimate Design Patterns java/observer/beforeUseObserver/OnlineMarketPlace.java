package observer.beforeUseObserver;

import java.util.ArrayList;
import java.util.List;

public class OnlineMarketPlace {
    private List<User> users;
    private List<Product> products;
    private List<Offer> offers;

    public OnlineMarketPlace() {
        this.users = new ArrayList<>();
        this.products = new ArrayList<>();
        this.offers = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }


    // Add new product
    public void addNewProduct(Product product) {
        products.add(product);
        notifyUser(product);
    }

    public void notifyUser(Product product) {
        users.forEach(user -> {
            if (!user.isSubscribedToProduct()){
                return;
            }
            user.notify(product);
        });
    }


    // Add new Offer

    public void addNewOffer(Offer offer) {
        offers.add(offer);
        notifyUser(offer);
    }

    public void notifyUser(Offer offer) {
        users.forEach(user -> {
            if (!user.isSubscribedToOffer()){
                return;
            }
            user.notify(offer);
        });
    }
}
