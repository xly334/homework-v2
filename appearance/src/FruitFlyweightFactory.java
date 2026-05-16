import java.util.HashMap;
import java.util.Map;

class FruitFlyweightFactory {
    // 享元池：存储已创建的水果对象
    private Map<String, Fruit> fruitPool = new HashMap<>();
    // 单例实例
    private static FruitFlyweightFactory instance = new FruitFlyweightFactory();

    // 私有构造函数
    private FruitFlyweightFactory() {}

    // 获取单例
    public static FruitFlyweightFactory getInstance() {
        return instance;
    }

    // 获取水果享元对象（不存在则创建，存在则复用）
    public Fruit getFruit(String fruitType) {
        if (!fruitPool.containsKey(fruitType)) {
            switch (fruitType) {
                case "apple":
                    fruitPool.put(fruitType, new Apple());
                    break;
                case "banana":
                    fruitPool.put(fruitType, new Banana());
                    break;
                case "orange":
                    fruitPool.put(fruitType, new Orange());
                    break;
                default:
                    throw new IllegalArgumentException("不支持的水果类型：" + fruitType);
            }
        } else {
            System.out.println("存在" + fruitPool.get(fruitType).getName() );
        }
        return fruitPool.get(fruitType);
    }
}