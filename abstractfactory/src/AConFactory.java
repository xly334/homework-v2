public class AConFactory implements AbstractFactory {
    @Override
    public Fruit createFruit() {
        return new Apple();
    }

    @Override
    public Vegetables createVegetable() {
        return new Tomato();
    }
}// A系列工厂：生产Apple + Tomato（对应UML的AConF/AConV）
