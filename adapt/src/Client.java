public class Client {
    public static void main(String[] args) {
        System.out.println("新系统的包装");

        Fruit appleInBag = new Apple(new PlasticBag());
        appleInBag.show();

        Fruit bananaInBox = new Banana(new GiftBox());
        bananaInBox.show();

        System.out.println("\n-旧系统的包装 ---");

        Packaging oldPaperPack = new PaperPackAdapter(new OldPaperPack());

        Fruit appleInPaper = new Apple(oldPaperPack);
        appleInPaper.show();
        Fruit bananaInPaper = new Banana(oldPaperPack);
        bananaInPaper.show();
    }
}