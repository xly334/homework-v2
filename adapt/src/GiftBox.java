class GiftBox implements Packaging {
    @Override
    public void pack(String fruitName) {
        System.out.println("用精美礼盒包装：" + fruitName);
    }
}