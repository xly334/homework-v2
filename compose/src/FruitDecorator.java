abstract class FruitDecorator extends FruitComponent {
    // 持有被装饰的对象
    protected FruitComponent component;

    public FruitDecorator(FruitComponent component) {
        this.component = component;
    }

    // 委托给被装饰对象
    @Override
    public double getPrice() {
        return component.getPrice();
    }

    @Override
    public void show(String prefix) {
        component.show(prefix);
    }
}