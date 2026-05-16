class PlasticBag implements Packaging {
    @Override
    public void pack(String fruitName) {
        System.out.println("用塑料袋包装：" + fruitName);
    }
}