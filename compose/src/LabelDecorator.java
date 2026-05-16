class LabelDecorator extends FruitDecorator {
    private double labelPrice = 0.5; // 标签成本

    public LabelDecorator(FruitComponent component) {
        super(component);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + labelPrice;
    }

    @Override
    public void show(String prefix) {
        super.show(prefix);
        System.out.println(prefix + "  + 价格标签 ￥" + labelPrice);
    }
}