public class Client {
    public static void main(String[] args) {
        System.out.println("代理模式");

        FruitShop shop = new FruitShopProxy();

        shop.sellFruit("apple", 3);
        shop.sellFruit("banana", 5);
    }
}