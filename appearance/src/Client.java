public class Client {
    public static void main(String[] args) {
        FruitStoreFacade store = new FruitStoreFacade();

        store.buyFruit("apple", 3);
        store.buyFruit("banana", 5);
        store.buyFruit("apple", 2);
        store.buyFruit("orange", 4);
    }
}