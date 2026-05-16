class FruitShopMediator implements OrderMediator {
    private Clerk clerk;
    private Manager manager;

    @Override
    public void registerClerk(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void registerManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public void submitOrder(Order order) {
        System.out.println("\n📋 订单提交审批：" + order);
        if (order.getTotalPrice() < 100) {
            clerk.handleOrder(order);
        } else {
            manager.handleOrder(order);
        }
    }
}