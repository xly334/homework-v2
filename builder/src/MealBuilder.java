public abstract class MealBuilder {
    // 持有产品Meal对象，由子类组装部件
    protected Meal meal = new Meal();

    // 抽象构建步骤：食物、饮料
    public abstract void buildFood();
    public abstract void buildDrink();

    // 返回组装好的产品
    public Meal getMeal() {
        return meal;
    }
}