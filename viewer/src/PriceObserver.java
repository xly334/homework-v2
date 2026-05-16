class PriceObserver implements FruitObserver {
    @Override
    public void update(Fruit fruit) {
        System.out.println("【价格系统】" + fruit.getName() + "当前价格调整为：￥" + fruit.getPrice() + "/斤");
    }
}
