class BossHandler extends OrderHandler {
    public BossHandler(String name) {
        super(name);
    }

    @Override
    public void handleOrder(OrderCommand command) {
        System.out.println("【老板" + name + "】审批通过：" + command.getOrderInfo());
        command.execute(); // 老板审批所有订单
    }
}