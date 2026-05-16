class RealFruitShop implements FruitShop {
    @Override
    public void sellFruit(String fruitType, int count) {
        String fruitName = fruitType.equals("apple") ? "红富士苹果" : "进口香蕉";
        double price = fruitType.equals("apple") ? 5.0 : 3.0;
        double total = price * count;
        System.out.println("【水果店】售出" + count + "斤" + fruitName + "，总价：￥" + total);
    }
}