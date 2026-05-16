class FruitShopProxy implements FruitShop {
    private RealFruitShop realShop;

    public FruitShopProxy() {
        this.realShop = new RealFruitShop();
    }

    @Override
    public void sellFruit(String fruitType, int count) {
        beforeSell(fruitType);

        realShop.sellFruit(fruitType, count);

        afterSell(fruitType, count);
    }

    private void beforeSell(String fruitType) {
        String fruitName = fruitType.equals("apple") ? "红富士苹果" : "进口香蕉";
        System.out.println("【购买】检查" + fruitName + "新鲜度：合格");
    }

    private void afterSell(String fruitType, int count) {
        String fruitName = fruitType.equals("apple") ? "红富士苹果" : "进口香蕉";
        System.out.println("【购买】将" + count + "斤" + fruitName + "装入环保袋");
        System.out.println("【购买】开具电子小票，交易完成\n");
    }
}