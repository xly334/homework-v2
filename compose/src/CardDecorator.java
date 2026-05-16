class CardDecorator extends FruitDecorator {
    private double cardPrice = 3.0; // 贺卡成本
    private String message;

    public CardDecorator(FruitComponent component, String message) {
        super(component);
        this.message = message;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + cardPrice;
    }

    @Override
    public void show(String prefix) {
        super.show(prefix);
        System.out.println(prefix + "  + 祝福贺卡 ￥" + cardPrice + "（内容：" + message + "）");
    }
}