abstract class Fruit {
    protected Packaging packaging;
    protected String kind;
    public Fruit(Packaging packaging) {
        this.packaging = packaging;
    }
    public abstract void show();
}