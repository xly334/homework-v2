class Apple extends Fruit {
    public Apple() {
        this.name = "红富士苹果";
        this.price = 5.0;
        System.out.println("创建苹果模板");
    }

    @Override
    public void showInfo(int count) {
        System.out.println("水果：" + name + "，数量：" + count + "斤，单价：￥" + price);
    }
}