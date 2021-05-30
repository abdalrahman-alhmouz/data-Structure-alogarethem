package breadthFirst;

public class Edge {
    Node left ;
    Node right ;
    int  weight ;

    public Edge(Node left,Node right,int weight){
        this.left=left;
        this.right=right;
        this.weight=weight;
    }


}
