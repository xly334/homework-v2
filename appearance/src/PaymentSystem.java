class PaymentSystem {
    public double calculateTotal(Fruit fruit, int count) {
        double total = fruit.getPrice() * count;
        System.out.println("【结算系统】计算总价：" + count + " × ￥" + fruit.getPrice() + " = ￥" + total);
        return total;
    }

    public void completePayment(double amount) {
        System.out.println("收款成功，金额：￥" + amount);
    }
}