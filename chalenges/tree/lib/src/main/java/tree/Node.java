package tree;

public class Node {
    public int value;
    Node left ,rigth;
public Node(){

}
    public Node(int value) {
        this.value = value;
        left=rigth=null;
    }
    public Node(int value,Node left,Node rigth) {
        this.value = value;
        this.left = left;
        this.rigth=rigth;
    }
}
