class ExpiringState extends FruitState {
    @Override
    public String getStatusName() {
        return "即将过期";
    }

    @Override
    public double getPrice(double basePrice) {
        return basePrice * 0.5; // 5折销售
    }

    @Override
    public boolean isSaleable() {
        return true; // 可售
    }

    @Override
    public void handleState(Fruit fruit) {
        // 新鲜度为0时，转换为已过期状态
        if (fruit.getFreshness() <= 0) {
            fruit.setState(new ExpiredState());
        }
    }
}