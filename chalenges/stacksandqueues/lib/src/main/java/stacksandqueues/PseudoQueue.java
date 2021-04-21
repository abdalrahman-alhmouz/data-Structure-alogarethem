package stacksandqueues;

public class PseudoQueue {
    private Node top=null;
  private   int size =0;
     Stack inbox = new Stack();
     Stack outbox = new Stack();

    public Stack enqueue(int item) {
        inbox.push(item);
        size++;
        return inbox;
    }

    public int dequeue() {
        if (outbox.isEmpty()) {
            while (!inbox.isEmpty()) {
                outbox.push(inbox.pop());
            }
        }
        size--;
        return outbox.pop();
    }

    @Override
    public String toString() {
        return "PseudoQueue{" +
                " size=" + size +
                ", inbox=" + inbox.size +
                ", outbox=" + outbox.size +
                '}';
    }
}
