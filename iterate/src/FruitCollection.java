import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class FruitCollection implements Iterable<Fruit> {
    private List<Fruit> fruits = new ArrayList<>();

    public void addFruit(Fruit f) {
        fruits.add(f);
    }

    @Override
    public Iterator<Fruit> iterator() {
        return fruits.iterator();
    }
}