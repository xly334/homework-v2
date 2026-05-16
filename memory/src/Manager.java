class Manager {
    private String name;
    private OrderMediator mediator;

    public Manager(String name, OrderMediator mediator) {
        this.name = name;
        this.mediator = mediator;
        mediator.registerManager(this);
    }

    public void handleOrder(Order order) {
        System.out.println("👔 店长" + name + "审批通过，已完成发货");
    }
}
