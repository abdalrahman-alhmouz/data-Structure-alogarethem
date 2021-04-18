package stacksandqueues;

public class PseudoQueue {
    private Node top=null;
    int size =0;
    public Stack inbox = new Stack();
    public Stack outbox = new Stack();

    public Stack enqueue(int item) {
        inbox.push(item);
        return inbox;
    }

    public int dequeue() {
        if (outbox.isEmpty()) {
            while (!inbox.isEmpty()) {
                outbox.push(inbox.pop());
            }
        }
        return outbox.pop();
    }

//    @Override
//    public String toString() {
//        return "PseudoQueue{" +outbox.peek();
//    }
}
