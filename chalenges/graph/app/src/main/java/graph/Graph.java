package graph;

import java.util.*;

class Graph<T> {

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


    public boolean hasEdge(Node Left, Node right,int weight)
    {
        Edge edge = new Edge( Left,  right, weight);
        for (Edge edgList: listEdgs){
            if (edgList.right.value==edge.right.value
                     &&edgList.left.value==edge.left.value
                     &&edgList.weight==edge.weight) {
                return true ;
            }
        }
     return false ;
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

