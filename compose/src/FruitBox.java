class FruitBox extends FruitComponent {
    private java.util.List<FruitComponent> components = new java.util.ArrayList<>();

    public FruitBox(String name, double boxPrice) {
        this.name = name;
        this.price = boxPrice; // 礼盒本身的价格
    }

    // 实现组合方法
    @Override
    public void add(FruitComponent component) {
        components.add(component);
    }

    @Override
    public void remove(FruitComponent component) {
        components.remove(component);
    }

    // 总价 = 礼盒价格 + 所有子组件价格
    @Override
    public double getPrice() {
        double total = price;
        for (FruitComponent component : components) {
            total += component.getPrice();
        }
        return total;
    }

    // 递归展示所有子组件
    @Override
    public void show(String prefix) {
        System.out.println(prefix + "【" + name + "】 礼盒费 ￥" + price);
        for (FruitComponent component : components) {
            component.show(prefix + "  "); // 缩进显示子组件
        }
        System.out.println(prefix + "【" + name + "】 小计 ￥" + getPrice());
    }
}