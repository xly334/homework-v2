public class Client {
    public static void main(String[] args) {
        // 1. 从XML配置中动态获取具体建造者（复用你之前的XMLUtil）
        MealBuilder mb = (MealBuilder) XMLUtil.getBean();

        // 2. 指挥者（服务员）
        KFCWaiter waiter = new KFCWaiter();
        waiter.setMealBuilder(mb);

        // 3. 指挥者组装套餐
        Meal meal = waiter.construct();

        // 4. 输出最终套餐信息
        System.out.println("套餐组成：");
        System.out.println("主食：" + meal.getFood());
        System.out.println("饮料：" + meal.getDrink());
    }
}