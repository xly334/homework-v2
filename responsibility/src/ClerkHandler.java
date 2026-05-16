class ClerkHandler extends OrderHandler {
    public ClerkHandler(String name) {
        super(name);
    }

    @Override
    public void handleOrder(OrderCommand command) {
        if (command.getTotalAmount() < 100) {
            System.out.println("【店员" + name + "】审批通过：" + command.getOrderInfo());
            command.execute();
        } else {
            System.out.println("【店员" + name + "】订单金额超过权限，转交给店长审批");
            if (nextHandler != null) {
                nextHandler.handleOrder(command);
            }
        }
    }
}