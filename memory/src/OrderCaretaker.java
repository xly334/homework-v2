import java.util.Stack;

class OrderCaretaker {
    private Stack<OrderMemento> mementoStack = new Stack<>();

    public void saveMemento(OrderMemento memento) {
        mementoStack.push(memento);
    }

    public OrderMemento getLastMemento() {
        return mementoStack.isEmpty() ? null : mementoStack.pop();
    }
}