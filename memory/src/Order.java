class Order {
    private String fruitType;
    private int count;
    private String discount;

    public OrderMemento createMemento() {
        return new OrderMemento(fruitType, count, discount);
    }

    public void restoreMemento(OrderMemento memento) {
        this.fruitType = memento.getFruitType();
        this.count = memento.getCount();
        this.discount = memento.getDiscount();
        System.out.println("✅ 订单已撤销，恢复到上一状态");
    }

    public double getTotalPrice() {
        double price = fruitType.equals("apple") ? 5.0 : 3.0;
        double rate = discount.equals("原价") ? 1.0 : 0.5;
        return count * price * rate;
    }

    public void setFruitType(String fruitType) { this.fruitType = fruitType; }
    public void setCount(int count) { this.count = count; }
    public void setDiscount(String discount) { this.discount = discount; }
    public String getFruitType() { return fruitType; }
    public int getCount() { return count; }
    public String getDiscount() { return discount; }

    @Override
    public String toString() {
        String fruitName = fruitType.equals("apple") ? "红富士苹果" : "进口香蕉";
        return fruitName + " × " + count + "斤，" + discount + "，总价：￥" + String.format("%.1f", getTotalPrice());
    }
}