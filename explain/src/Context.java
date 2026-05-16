import java.util.HashMap;
import java.util.Map;

class Context {
    private Map<String, Double> priceMap = new HashMap<>();

    public Context() {
        // 初始化水果单价
        priceMap.put("apple", 5.0);
        priceMap.put("banana", 3.0);
    }

    // 获取水果单价
    public double getPrice(String fruitType) {
        return priceMap.getOrDefault(fruitType, 0.0);
    }
}