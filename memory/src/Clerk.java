class Clerk {
    private String name;
    private OrderMediator mediator;

    public Clerk(String name, OrderMediator mediator) {
        this.name = name;
        this.mediator = mediator;
        mediator.registerClerk(this);
    }

    public void handleOrder(Order order) {
        System.out.println("👨‍💼 店员" + name + "审批通过，已完成发货");
    }
}
