class OrderSystem {
    private OrderHandler approvalChain;

    public OrderSystem() {
        OrderHandler clerk = new ClerkHandler("张三");
        OrderHandler manager = new ManagerHandler("李四");
        OrderHandler boss = new BossHandler("王五");

        clerk.setNextHandler(manager);
        manager.setNextHandler(boss);

        this.approvalChain = clerk;
    }

    public void submitOrder(OrderCommand command) {
        System.out.println("\n提交新订单");
        System.out.println("订单详情：" + command.getOrderInfo());
        approvalChain.handleOrder(command);
        System.out.println("订单处理完成");
    }
}