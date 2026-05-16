// B系列工厂：生产Banana + Cabbage（对应UML的BConF/BConV）
public class BConFactory implements AbstractFactory {
    @Override
    public Fruit createFruit() {
        return new Banana();
    }

    @Override
    public Vegetables createVegetable() {
        return new Cabbage();
    }
}