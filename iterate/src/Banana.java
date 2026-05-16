class Banana extends Fruit {
    public Banana() {
        super("进口香蕉", 3.0);
    }

    @Override
    protected void check() {
        System.out.println("→ 检查香蕉：无破损");
    }

    @Override
    protected void calculate(PriceStrategy strategy) {
        double finalPrice = strategy.getPrice(basePrice);
        // 保留1位小数输出
        System.out.println("→ 香蕉最终价：" + String.format("%.1f", finalPrice) + "元/斤");
    }
    @Override
    protected void accept(FruitVisitor visitor) {
        visitor.visitBanana(this);
    }
}