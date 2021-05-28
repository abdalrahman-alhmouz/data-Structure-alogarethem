package graph;

import java.util.*;

class Graph<T> {

    // We use Hashmap to store the edges in the graph
    private Map<T, List<T> > map = new HashMap<>();

    List<Node> listNode=new ArrayList<>();
    List<Edge> listEdgs=new ArrayList<>();

    // This function adds a new vertex to the graph
    public void addNode(T value)
    {
        Node node=new Node((int)value);
        listNode.add(node);

        //        map.put(s, new LinkedList<T>());
    }

    // This function adds the edge
    // between source to destination
    public void addEdge(T source,T destination, int weigh) {
        if (!listNode.contains(source))
            addNode(source);

        if (!listNode.contains(destination))
            addNode(destination);

//        Edge edge = new Edge((Node) source, (Node) destination, weigh);
//        listEdgs.add(edge);

    }

    // This function gives the count of vertices
    public void getNodeCount()
    {
        System.out.println("The graph has "
                + listNode.size()
                + " vertex");
    }

    // This function gives the count of edges
    public void getEdgesCount(boolean bidirection)
    {
        int count = 0;
        for (T v : map.keySet()) {
            count += map.get(v).size();
        }
        if (bidirection == true) {
            count = count / 2;
        }
        System.out.println("The graph has "
                + count
                + " edges.");
    }

    // This function gives whether
    // a vertex is present or not.
    public void hasVertex(T s)
    {
        if (listNode.contains(s)) {
            System.out.println("The graph contains "
                    + s + " as a vertex.");
        }
        else {
            System.out.println("The graph does not contain "
                    + s + " as a vertex.");
        }
    }

    // This function gives whether an edge is present or not.
    public void hasEdge(T s, T d,int weight)
    {
        Edge edge = new Edge((Node) s, (Node) d, weight);

        if (listEdgs.contains(edge)) {
            System.out.println("The graph has an edge between "
                    + s + " and " + d + ".");
        }
        else {
            System.out.println("The graph has no edge between "
                    + s + " and " + d + ".");
        }
    }

    // Prints the adjancency list of each vertex.
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();

        for (T v : map.keySet()) {
            builder.append(v.toString() + ": ");
            for (T w : map.get(v)) {
                builder.append(w.toString() + " ");
            }
            builder.append("\n");
        }

        return (builder.toString());
    }
}

