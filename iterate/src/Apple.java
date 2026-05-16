class Apple extends Fruit {
    public Apple() {
        super("红富士苹果", 5.0);
    }

    @Override
    protected void check() {
        System.out.println("→ 检查苹果：新鲜完好");
    }

    @Override
    protected void calculate(PriceStrategy strategy) {
        double finalPrice = strategy.getPrice(basePrice);
        System.out.println("→ 苹果最终价：" + finalPrice + "元/斤");
    }

    @Override
    protected void accept(FruitVisitor visitor) {
        visitor.visitApple(this);
    }
}