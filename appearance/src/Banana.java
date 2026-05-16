class Banana extends Fruit {
    public Banana() {
        this.name = "进口香蕉";
        this.price = 3.0;
        System.out.println("创建香蕉模板");
    }

    @Override
    public void showInfo(int count) {
        System.out.println("水果：" + name + "，数量：" + count + "斤，单价：￥" + price);
    }
}