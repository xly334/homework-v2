import java.util.ArrayList;
import java.util.List;

class Fruit {
    private String name;
    private double basePrice;
    private int freshness;
    private FruitState currentState;
    private List<FruitObserver> observers = new ArrayList<>();

    public Fruit(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
        this.freshness = 100;
        this.currentState = new FreshState();
    }

    public void addObserver(FruitObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (FruitObserver observer : observers) {
            observer.update(this);
        }
    }

    public void setState(FruitState newState) {
        this.currentState = newState;
        System.out.println("\n>>> " + name + "状态变化为：" + newState.getStatusName());
        notifyObservers(); // 状态变化时通知所有观察者
    }

    public void timePass(int days) {
        freshness -= days * 10; // 每天新鲜度下降10
        if (freshness < 0) freshness = 0;
        System.out.println("\n 经过" + days + "天，" + name + "新鲜度变为：" + freshness);
        currentState.handleState(this); // 由当前状态处理状态转换
    }

    public double getPrice() {
        return currentState.getPrice(basePrice);
    }

    public boolean isSaleable() {
        return currentState.isSaleable();
    }

    public String getName() { return name; }
    public int getFreshness() { return freshness; }
    public FruitState getCurrentState() { return currentState; }
}