public class Client {
    public static void main(String[] args) {
        // 1. 创建原型对象
        MyFruit fru1 = new Apple();
        MyFruit fru2 = new Banana();

        // 2. 获取单例的原型管理器实例
        MyFruitStore mfs = MyFruitStore.Getfruitstore();

        // 3. 向原型池添加原型对象
        mfs.Add(1, fru1);
        mfs.Add(2, fru2);
        mfs.Add(3, new Apple());
        mfs.Add(4, new Banana());

        // 4. 从原型池获取克隆对象（浅拷贝）
        MyFruit fru = (MyFruit) mfs.Get(3);
        fru.Display(); // 输出Apple

        // 验证单例：两次获取的实例是同一个
        MyFruitStore mfs2 = MyFruitStore.Getfruitstore();
        System.out.println("mfs1:" + mfs.toString());
        System.out.println("mfs2:" + mfs2.toString()); // 和mfs的hashCode完全相同
    }
}