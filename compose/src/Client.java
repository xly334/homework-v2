public class Client {
    public static void main(String[] args) {
        System.out.println("\n1. 单个水果加装饰");
        FruitComponent apple = new Apple();
        apple = new LabelDecorator(apple);
        apple = new RibbonDecorator(apple);
        apple.show("");
        System.out.println("总价：￥" + apple.getPrice());

        System.out.println("\n2. 组合：多层礼盒");
        FruitComponent smallBox = new FruitBox("小礼盒", 2.0);
        smallBox.add(new Banana());
        smallBox.add(new Banana());
        smallBox.add(new Orange());

        FruitComponent bigBox = new FruitBox("豪华大礼盒", 5.0);
        bigBox.add(new Apple());
        bigBox.add(smallBox);
        bigBox.show("");
        System.out.println("大礼盒总价：￥" + bigBox.getPrice());

        System.out.println("\n3. 组合+装饰：给整个大礼盒加装饰 ");
        FruitComponent giftBox = new RibbonDecorator(bigBox);
        giftBox = new CardDecorator(giftBox, "生日快乐！");
        giftBox.show("");
        System.out.println("最终总价：￥" + giftBox.getPrice());
    }
}