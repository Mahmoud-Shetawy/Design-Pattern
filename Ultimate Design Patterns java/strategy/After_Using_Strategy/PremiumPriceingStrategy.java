package strategy.After_Using_Strategy;

public class PremiumPriceingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(double price) {
        return price * 0.8; // 20% discount;
    }
}
