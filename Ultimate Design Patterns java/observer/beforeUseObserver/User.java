package observer.beforeUseObserver;

public class User {
    private String name;

    private boolean isSubscribedToProduct;

    private boolean isSubscribedToOffer;

    public User(String name, boolean isSubscribedToProduct, boolean isSubscribedToOffer) {
        this.name = name;
        this.isSubscribedToProduct = isSubscribedToProduct;
        this.isSubscribedToOffer = isSubscribedToOffer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSubscribedToProduct() {
        return isSubscribedToProduct;
    }

    public void setSubscribedToProduct(boolean subscribedToProduct) {
        isSubscribedToProduct = subscribedToProduct;
    }

    public boolean isSubscribedToOffer() {
        return isSubscribedToOffer;
    }

    public void setSubscribedToOffer(boolean subscribedToOffer) {
        isSubscribedToOffer = subscribedToOffer;
    }

    public void notify(Product product){
        System.out.println("Notifying "+this.name+" about new Product : "+product.getName());

    }
    public void notify(Offer offer){
        System.out.println("Notifying "+this.name+" about new Offer : "+offer.getMessage());
    }
}
