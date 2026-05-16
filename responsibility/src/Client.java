public class Client {
    public static void main(String[] args) {

        FruitShop shop = new FruitShop();
        OrderSystem orderSystem = new OrderSystem();

        OrderCommand order1 = new BuyAppleCommand(10, shop); // 50元
        orderSystem.submitOrder(order1);

        OrderCommand order2 = new BuyBananaCommand(50, shop); // 150元
        orderSystem.submitOrder(order2);

        OrderCommand order3 = new BuyAppleCommand(200, shop); // 1000元
        orderSystem.submitOrder(order3);
    }
}