package strategy.After_Using_Strategy;

import strategy.Before_Using_Strategy.MemberShipType;

public class Product {
    private String name;
    private double price;
    private PricingStrategy pricingStrategy;

    public Product(String name, double price, PricingStrategy pricingStrategy) {
        this.name = name;
        this.price = price;
        this.pricingStrategy = pricingStrategy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double calculatePrice() {
        return pricingStrategy.calculatePrice(price) ;

    }

}
