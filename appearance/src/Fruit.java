import java.util.HashMap;
import java.util.Map;

abstract class Fruit {
    protected String name;
    protected double price;

    // 内部状态：不变的属性（水果名称、单价）
    public String getName() { return name; }
    public double getPrice() { return price; }

    // 外部状态：变化的属性（购买数量），由客户端传入
    public abstract void showInfo(int count);
}