public class MyFruit implements Cloneable {
    protected String kind;

    @Override
    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone(); // 浅拷贝实现
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }

    public void Display() {
        System.out.println(kind);
    }
}