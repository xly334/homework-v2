class FruitExpression extends Expression {
    private String fruitType; // 水果类型
    private int count;        // 购买数量

    public FruitExpression(String fruitType, int count) {
        this.fruitType = fruitType;
        this.count = count;
    }

    @Override
    public double interpret(Context context) {
        // 从上下文获取水果单价，计算总价
        double price = context.getPrice(fruitType);
        return price * count;
    }
}