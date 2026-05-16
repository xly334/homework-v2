public class Client {
    public static void main(String[] args) {

        //创建水果集合
        FruitCollection collection = new FruitCollection();
        collection.addFruit(new Apple());
        collection.addFruit(new Banana());

        // 切换价格
        PriceStrategy strategy = new DiscountPrice();

        FruitVisitor visitor = new ShowVisitor();

        for (Fruit fruit : collection) {
            System.out.println("\n----- 开始处理水果 -----");
            fruit.process(strategy, visitor); // 模板方法
        }
    }
}