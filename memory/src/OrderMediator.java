interface OrderMediator {

    void submitOrder(Order order);

    void registerClerk(Clerk clerk);
    void registerManager(Manager manager);
}