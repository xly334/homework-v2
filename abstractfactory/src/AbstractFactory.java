// 抽象工厂：同时定义“生产水果”和“生产蔬菜”的方法
public interface AbstractFactory {
    Fruit createFruit();   // 对应UML的CreateF()
    Vegetables createVegetable(); // 对应UML的CreateV()
}