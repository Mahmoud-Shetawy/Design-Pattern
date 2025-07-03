package strategy.After_Using_Strategy;

public class GoldPriceingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(double price) {
        return price * 0.9; // 10% discount

    }
}
