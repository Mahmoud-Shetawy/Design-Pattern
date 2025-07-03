package strategy.After_Using_Strategy;

public class RegularPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(double price) {
        return price;
    }
}
