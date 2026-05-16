class OrderMemento {
    private String fruitType;
    private int count;
    private String discount;

    public OrderMemento(String fruitType, int count, String discount) {
        this.fruitType = fruitType;
        this.count = count;
        this.discount = discount;
    }

    public String getFruitType() { return fruitType; }
    public int getCount() { return count; }
    public String getDiscount() { return discount; }
}