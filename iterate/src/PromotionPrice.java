class PromotionPrice implements PriceStrategy {
    @Override
    public double getPrice(double base) {
        return base * 0.5;
    }
}