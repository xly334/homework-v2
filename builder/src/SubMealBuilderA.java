public class SubMealBuilderA extends MealBuilder {
    @Override
    public void buildFood() {
        meal.setFood("汉堡");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("可乐");
    }
}