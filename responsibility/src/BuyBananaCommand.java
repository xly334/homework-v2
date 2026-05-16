class BuyBananaCommand implements OrderCommand {
    private int count;
    private FruitShop receiver;

    public BuyBananaCommand(int count, FruitShop receiver) {
        this.count = count;
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.sellBanana(count);
    }

    @Override
    public double getTotalAmount() {
        return count * 3.0; // 香蕉3元/斤
    }

    @Override
    public String getOrderInfo() {
        return "购买" + count + "斤进口香蕉，总价：￥" + getTotalAmount();
    }
}