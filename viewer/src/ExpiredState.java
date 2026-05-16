class ExpiredState extends FruitState {
    @Override
    public String getStatusName() {
        return "已过期";
    }

    @Override
    public double getPrice(double basePrice) {
        return 0; // 不可销售
    }

    @Override
    public boolean isSaleable() {
        return false; // 不可售
    }

    @Override
    public void handleState(Fruit fruit) {
        // 已过期状态不再转换
    }
}