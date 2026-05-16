class InventoryObserver implements FruitObserver {
    @Override
    public void update(Fruit fruit) {
        String status = fruit.getCurrentState().getStatusName();
        System.out.println("【库存系统】更新" + fruit.getName() + "状态为：" + status);
        if (fruit.isSaleable()) {
            System.out.println("【库存系统】" + fruit.getName() + "可正常销售");
        } else {
            System.out.println("【库存系统】" + fruit.getName() + "已下架，禁止销售");
        }
    }
}