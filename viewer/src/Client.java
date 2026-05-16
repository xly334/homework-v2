public class Client {
    public static void main(String[] args) {
        // 创建水果对象
        Fruit apple = new Fruit("红富士苹果", 5.0);
        Fruit banana = new Fruit("进口香蕉", 3.0);

        // 为水果添加观察者
        apple.addObserver(new InventoryObserver());
        apple.addObserver(new PriceObserver());
        apple.addObserver(new PromotionObserver());

        banana.addObserver(new InventoryObserver());
        banana.addObserver(new PriceObserver());
        banana.addObserver(new PromotionObserver());

        // 初始状态通知
        System.out.println("初始状态");
        apple.notifyObservers();
        banana.notifyObservers();

        // 模拟时间流逝，观察状态变化和观察者响应
        apple.timePass(8); // 8天后，新鲜度20 → 即将过期
        banana.timePass(5); // 5天后，新鲜度50 → 仍新鲜
        apple.timePass(3); // 再3天，新鲜度-10 → 已过期
    }
}