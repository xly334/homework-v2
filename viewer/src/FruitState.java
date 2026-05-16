abstract class FruitState {
    // 获取状态名称
    public abstract String getStatusName();
    // 获取当前状态下的价格
    public abstract double getPrice(double basePrice);
    // 判断当前状态是否可售
    public abstract boolean isSaleable();
    // 处理状态转换
    public abstract void handleState(Fruit fruit);
}