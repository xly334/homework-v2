class Banana extends Fruit {
    public Banana(Packaging packaging) {
        super(packaging);
        this.kind = "香蕉";
    }

    @Override
    public void show() {
        System.out.print("这是一根");
        packaging.pack(kind);
    }
}