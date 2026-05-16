class PromotionObserver implements FruitObserver {
    @Override
    public void update(Fruit fruit) {
        if (fruit.getCurrentState() instanceof ExpiringState) {
            System.out.println("【促销系统】推送" + fruit.getName() + "限时5折优惠！");
        } else if (fruit.getCurrentState() instanceof ExpiredState) {
            System.out.println("【促销系统】取消" + fruit.getName() + "所有促销活动");
        }
    }
}