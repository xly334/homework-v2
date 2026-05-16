class Apple extends Fruit {
    public Apple(Packaging packaging) {
        super(packaging);
        this.kind = "苹果";
    }

    @Override
    public void show() {
        System.out.print("这是一个");
        packaging.pack(kind);
    }
}