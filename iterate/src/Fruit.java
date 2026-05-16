abstract class Fruit {
    protected String name;
    protected double basePrice;

    public Fruit(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    // 模板方法：固定流程骨架
    public final void process(PriceStrategy strategy, FruitVisitor visitor) {
        check();      // 步骤1
        calculate(strategy); // 步骤2
        accept(visitor);    // 步骤3
    }

    // 模板步骤
    protected abstract void check();
    protected abstract void calculate(PriceStrategy strategy);
    protected abstract void accept(FruitVisitor visitor);

    // getter
    public String getName() { return name; }
    public double getBasePrice() { return basePrice; }
}