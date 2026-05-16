class FruitStoreFacade {
    // 持有所有子系统的引用
    private InventorySystem inventorySystem;
    private PackagingSystem packagingSystem;
    private PaymentSystem paymentSystem;
    private FruitFlyweightFactory flyweightFactory;

    public FruitStoreFacade() {
        inventorySystem = new InventorySystem();
        packagingSystem = new PackagingSystem();
        paymentSystem = new PaymentSystem();
        flyweightFactory = FruitFlyweightFactory.getInstance();
    }

    // 对外提供的统一购买方法（客户端只需要调用这一个方法）
    public void buyFruit(String fruitType, int count) {
        System.out.println("\n开始购买" + count + "斤" + fruitType );

        // 1. 检查库存
        if (!inventorySystem.checkStock(fruitType, count)) {
            System.out.println("库存不足，购买失败");
            return;
        }

        // 2. 从享元工厂获取水果对象
        Fruit fruit = flyweightFactory.getFruit(fruitType);
        fruit.showInfo(count);

        // 3. 扣除库存
        inventorySystem.deductStock(fruitType, count);

        // 4. 包装水果
        packagingSystem.packFruit(fruit, count);

        // 5. 结算付款
        double total = paymentSystem.calculateTotal(fruit, count);
        paymentSystem.completePayment(total);

        System.out.println("购买完成");
    }
}