class DiscountPrice implements PriceStrategy {
    @Override
    public double getPrice(double base) {
        return base * 0.8;
    }
}