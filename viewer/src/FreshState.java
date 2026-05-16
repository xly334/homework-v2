class FreshState extends FruitState {
    @Override
    public String getStatusName() {
        return "新鲜";
    }

    @Override
    public double getPrice(double basePrice) {
        return basePrice; // 原价销售
    }

    @Override
    public boolean isSaleable() {
        return true; // 可售
    }

    @Override
    public void handleState(Fruit fruit) {
        // 新鲜度下降后，转换为即将过期状态
        if (fruit.getFreshness() < 30) {
            fruit.setState(new ExpiringState());
        }
    }
}