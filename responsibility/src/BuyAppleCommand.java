class BuyAppleCommand implements OrderCommand {
    private int count;
    private FruitShop receiver;

    public BuyAppleCommand(int count, FruitShop receiver) {
        this.count = count;
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.sellApple(count);
    }

    @Override
    public double getTotalAmount() {
        return count * 5.0; // 苹果5元/斤
    }

    @Override
    public String getOrderInfo() {
        return "购买" + count + "斤红富士苹果，总价：￥" + getTotalAmount();
    }
}