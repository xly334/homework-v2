class Apple extends FruitComponent {
    public Apple() {
        this.name = "红富士苹果";
        this.price = 5.0;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void show(String prefix) {
        System.out.println(prefix + name + " ￥" + price);
    }
}