class Orange extends FruitComponent {
    public Orange() {
        this.name = "赣南脐橙";
        this.price = 4.0;
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