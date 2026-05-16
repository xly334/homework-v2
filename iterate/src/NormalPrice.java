class NormalPrice implements PriceStrategy {
    @Override
    public double getPrice(double base) {
        return base;
    }
}