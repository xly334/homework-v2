abstract class FruitComponent {
    protected String name;
    protected double price;

    // 通用方法：获取总价
    public abstract double getPrice();
    // 通用方法：展示详情
    public abstract void show(String prefix);

    // 组合模式特有方法
    public void add(FruitComponent component) {}
    public void remove(FruitComponent component) {}
}