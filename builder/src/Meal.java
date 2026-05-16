public class Meal {
    // 套餐的部件：食物+饮料
    private String food;
    private String drink;

    public void setFood(String food) {
        this.food = food;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    // 补全getter方法，客户端输出套餐时会用到
    public String getFood() {
        return food;
    }

    public String getDrink() {
        return drink;
    }
}