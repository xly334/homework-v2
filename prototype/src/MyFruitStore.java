import java.util.Hashtable;

public class MyFruitStore {
    // 原型池：静态的Hashtable，存储所有原型对象
    private static Hashtable<Integer, MyFruit> fruittable = null;
    // 单例实例：私有静态变量
    private static MyFruitStore fruitstore = null;

    // 私有构造函数：单例模式禁止外部new，同时初始化原型池
    private MyFruitStore() {
        fruittable = new Hashtable<Integer, MyFruit>();
    }

    // 单例获取方法：懒汉式单例，第一次调用时创建实例
    public static MyFruitStore Getfruitstore() {
        if (fruitstore == null) {
            fruitstore = new MyFruitStore();
        }
        return fruitstore;
    }

    // 向原型池添加原型对象（实例方法，和你客户端调用风格一致）
    public void Add(Integer key, MyFruit fruit) {
        fruittable.put(key, fruit);
    }

    // 从原型池获取克隆对象（核心方法：调用原型的浅拷贝）
    public MyFruit Get(Integer key) {
        // 从池中获取原型对象
        MyFruit fruit = (MyFruit) fruittable.get(key);
        if (fruit != null) {
            // 调用原型的clone()方法（浅拷贝），返回新对象
            return (MyFruit) fruit.clone();
        }
        return null;
    }
}