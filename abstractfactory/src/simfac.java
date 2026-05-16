public class simfac {
    public static void main(String args[]) {
        // 从XML读取配置，反射创建具体工厂
        AbstractFactory factory = (AbstractFactory) XMLUtil.getBean();

        // 抽象工厂的特点：一个工厂同时生产一组相关产品
        Fruit fruit = factory.createFruit();
        Vegetables veg = factory.createVegetable();

        fruit.eat();
        veg.eat();
    }
}