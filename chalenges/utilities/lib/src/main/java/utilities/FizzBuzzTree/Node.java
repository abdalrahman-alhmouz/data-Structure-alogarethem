package utilities.FizzBuzzTree;

public class Node{

    public Object data;
    public Node left;
    public Node right;

    public Node(Object data) {
        this.data = data;
        this.right = null;
        this.left = null;
    }

    @Override
    public String toString() {
        return "data=" + data + " right= "+ right+" left= "+ left + " | ";
    }
}
