package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    Node root;
    boolean bool=false;
    String hello="" ;
    ArrayList<Integer> array=new ArrayList<>() ;

    public String printPostorder(Node node){

        if (node==null){
            return "null";
        }

        printPostorder(node.left);

        printPostorder(node.rigth);
        hello+=node.value + " ";
        return hello;
    }

    public String printInorder(Node node)
    {
        if (node == null){
            return "null";

        }

        /* first recur on left child */
        printInorder(node.left);

        /* then print the data of node */
        hello+=node.value + " ";

        /* now recur on right child */
        printInorder(node.rigth);
        return hello;
    }

    public String printPreorder(Node node){
        if (node == null){
            return null+"";

        }
        /* first print data of node */
        hello+=node.value + " ";

        /* then recur on left sutree */
        printPreorder(node.left);

        /* now recur on right subtree */
        printPreorder(node.rigth);
        return hello;

    }



    public String printPostorder() {return printPostorder(root); }
    public String printInorder() { return printInorder(root); }
    public String printPreorder() {return printPreorder(root);
    }


    public int findMax(Node rootExp){
        if (rootExp==null){
//        System.out.println("value can not found");
            return -1;
        }

        int root = rootExp.value;
        int lef = findMax(rootExp.left);
        int righ = findMax(rootExp.rigth);

        if (lef > root)
            root = lef;
        if (righ > root)
            root = righ;
        return root;

    }

    public  ArrayList<Integer> traversal(Node node){
        Queue<Node> q =new LinkedList<Node>();
        q.add(node);

        while (!q.isEmpty()){
            node=q.remove();
            hello+=node.value+"  ";
            array.add(node.value);
            if(node.left!=null){
                q.add(node.left);

                if (node.rigth!=null){
                    q.add(node.rigth);

                }
            }
        }

        return array;
    }

}
