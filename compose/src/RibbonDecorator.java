class RibbonDecorator extends FruitDecorator {
    private double ribbonPrice = 2.0; // 丝带成本

    public RibbonDecorator(FruitComponent component) {
        super(component);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + ribbonPrice;
    }

    @Override
    public void show(String prefix) {
        super.show(prefix);
        System.out.println(prefix + "  + 精美丝带 ￥" + ribbonPrice);
    }
}