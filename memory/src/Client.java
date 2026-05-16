public class Client {
    public static void main(String[] args) {

        OrderMediator mediator = new FruitShopMediator();
        Clerk clerk = new Clerk("张三", mediator);
        Manager manager = new Manager("李四", mediator);

        OrderCaretaker caretaker = new OrderCaretaker();

        System.out.println("\n创建初始订单");
        Order order = new Order();
        order.setFruitType("apple");
        order.setCount(10);
        order.setDiscount("原价");
        System.out.println("当前订单：" + order);
        caretaker.saveMemento(order.createMemento()); // 保存状态

        // 4. 修改订单
        System.out.println("\n修改订单");
        order.setFruitType("banana");
        order.setCount(50);
        order.setDiscount("五折");
        System.out.println("修改后订单：" + order);

        // 5. 撤销修改（备忘录模式核心）
        System.out.println("\n撤销修改");
        order.restoreMemento(caretaker.getLastMemento());
        System.out.println("撤销后订单：" + order);

        // 6. 提交订单审批（中介者模式核心）
        mediator.submitOrder(order);

        // 7. 再创建一个大额订单测试店长审批
        System.out.println("\n创建大额订单");
        Order bigOrder = new Order();
        bigOrder.setFruitType("apple");
        bigOrder.setCount(30);
        bigOrder.setDiscount("原价");
        mediator.submitOrder(bigOrder);
    }
}
