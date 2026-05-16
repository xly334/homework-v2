class Orange extends Fruit {
    public Orange() {
        this.name = "赣南脐橙";
        this.price = 4.0;
        System.out.println("创建橙子模板");
    }

    @Override
    public void showInfo(int count) {
        System.out.println("水果：" + name + "，数量：" + count + "斤，单价：￥" + price);
    }
}