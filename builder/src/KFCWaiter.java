public class KFCWaiter {
    // 持有抽象建造者
    private MealBuilder mb;

    // 注入具体建造者
    public void setMealBuilder(MealBuilder mb) {
        this.mb = mb;
    }

    // 组装套餐：按顺序调用构建步骤
    public Meal construct() {
        mb.buildFood();
        mb.buildDrink();
        return mb.getMeal();
    }
}