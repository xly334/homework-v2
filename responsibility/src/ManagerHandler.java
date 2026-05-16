class ManagerHandler extends OrderHandler {
    public ManagerHandler(String name) {
        super(name);
    }

    @Override
    public void handleOrder(OrderCommand command) {
        double amount = command.getTotalAmount();
        if (amount >= 100 && amount < 500) {
            System.out.println("【店长" + name + "】审批通过：" + command.getOrderInfo());
            command.execute(); // 审批通过，执行命令
        } else {
            System.out.println("【店长" + name + "】订单金额超过权限，转交给老板审批");
            if (nextHandler != null) {
                nextHandler.handleOrder(command);
            }
        }
    }
}