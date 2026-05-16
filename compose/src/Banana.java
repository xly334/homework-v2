class Banana extends FruitComponent {
    public Banana() {
        this.name = "进口香蕉";
        this.price = 3.0;
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