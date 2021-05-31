package breadthFirst;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class AddEdge {

    List<Node> listNode=new ArrayList<>();
    List<Edge> listEdgs=new ArrayList<>();

    public Node addNode(Node value)
    {
        listNode.add(value);
        return value;
    }
    public String isEmpty(){
        if(listNode.size()>0){
            return "not null";
        }
        return null;
    }
    public void addEdge(Node source,Node destination, int weigh) {
        if (!listNode.contains(source))
            addNode(source);

        if (!listNode.contains(destination))
            addNode(destination);

        Edge edge = new Edge(source, destination, weigh);
        listEdgs.add(edge);

    }

    public String getNodeCount()
    {
        return "The graph has "
                + listNode.size()
                + " Node";
    }
    int sum=0;
    public boolean hasEdge(Node[] array)
    {
        Node [] arrayEdge=new Node[array.length-1];
        Node [] arrayEdgeTow=new Node[array.length-1];

        for (Edge edgList: listEdgs){
            if (array.length>2){
                if (edgList.right.value==array[1].value&&edgList.left.value==array[0].value) {
                    arrayEdge= new Node[]{edgList.right, array[2]};
                    arrayEdgeTow= new Node[]{edgList.left, array[2]};
                    sum=sum+edgList.weight;

                    if(hasEdge(arrayEdgeTow)||hasEdge(arrayEdge)){
                        return true ;
                    }else {
                        return false;
                    }

                }
            }else {
                if (edgList.right.value==array[1].value&&edgList.left.value==array[0].value) {
                    sum=sum+edgList.weight;
                    return true ;
                }
            }
        }
        return false ;
    }
    String bool="";
    public String edgeContain(Node[] array){
        bool=hasEdge(array)+" , "+sum;
        sum=0;
        return bool;
    }
    public String  getNodes(){
        String nodeString="";
        for (Node node:listNode){
            nodeString+=node.value+" ";
        }
        return "the node in the graph "+ nodeString;
    }

    public String getNeighbors(Node node){
        String nodeString="";
        for (Edge edge:listEdgs){
            if (edge.left.value==node.value){
                nodeString+="the connected Node from right is " +edge.right.value +"and the weight of the connection is"+edge.weight;

            }else  if (edge.right.value==node.value){
                nodeString+="the connected Node from left is " +edge.left.value+" and the weight of the connection is "+edge.weight;

            }
        }
        return nodeString ;
    }

}
class Edge {
    Node left ;
    Node right ;
    int  weight ;

    public Edge(Node left,Node right,int price){
        this.left=left;
        this.right=right;
        this.weight=price;
    }


}
class Node {
    String value ;

    public Node(String value){
        this.value=value;

    }
}
