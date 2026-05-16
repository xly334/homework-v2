abstract class OrderHandler {
    protected OrderHandler nextHandler;
    protected String name;

    public OrderHandler(String name) {
        this.name = name;
    }

    public void setNextHandler(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    public abstract void handleOrder(OrderCommand command);
}