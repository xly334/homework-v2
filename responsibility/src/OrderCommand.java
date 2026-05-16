interface OrderCommand {

    void execute();

    double getTotalAmount();

    String getOrderInfo();
}