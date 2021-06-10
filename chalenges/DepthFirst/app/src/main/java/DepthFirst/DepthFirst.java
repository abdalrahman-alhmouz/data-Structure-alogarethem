package DepthFirst;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
public class DepthFirst {

    List<Node> listNode=new ArrayList<>();
    List<Edge> listEdgs=new ArrayList<>();
    ArrayList<ArrayList<Integer>> graph;
    int v =0;
    String nodeString="" ;
   public DepthFirst(int node){
        v=node;
        graph= new ArrayList<ArrayList<Integer>>();
        for (int i=0;i<v;i++){
            graph.add(new ArrayList<Integer>());

        }
    }
    public void addEdge(int v,int u){
        graph.get(v).add(u);
        graph.get(u).add(v);
    }
   public String DepthFirst(int node,boolean visited[]){
        visited[node]=true;
       nodeString+=node +" ->" ;
        for (int x:graph.get(node)){
            if (visited[x]==false){
                DepthFirst(x,visited);
            }
        }
        return nodeString;
    }
        public String dFS(){
            if(graph.size()==0)
                return null ;
        boolean visited[]=new boolean[v];
            DepthFirst(0,visited);
            return nodeString;
        }

    public Node addNode(Node value)
    {
        listNode.add(value);


        return value;
    }
    public String isEmpty(){
        if(graph.size()>0){
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

//    public String  getNodes(){
//        String nodeString="";
//        for (Node node:listNode){
//            nodeString+=node.value+" ";
//        }
//        return "the node in the graph "+ nodeString;
//    }



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
    int value ;

    public Node(int value){
        this.value=value;

    }
}
