package TreeIntersection;

import java.util.ArrayList;
import java.util.Stack;
import java.util.zip.Inflater;

public class TreeIntersection{
    ArrayList<Integer> arrTree=new ArrayList();
    ArrayList<Integer> arrTreeTow=new ArrayList();


    public void addNode(Node node,int num){
            if (node==null){
                node=new Node(num);

                        return;
            }
            if(num<node.value){
                if (node.left==null){
                    node.left=new Node(num);

                        return;
                }
                addNode(node.left,num);
            }

            if(num>node.value){
                if (node.rigth==null){
                    node.rigth=new Node(num);

                    return;
                }
                addNode(node.left,num);
            }
        }
    public ArrayList<Integer> inorder(Node root){
        if(root != null){
            inorder(root.left);
            if (arrTreeTow.contains(root.value))
                     arrTree.add(root.value);
                        arrTreeTow.add(root.value);
                            inorder(root.rigth);
        }
        return arrTree;
    }
    public ArrayList<Integer> treeIntersection(Node nodeOne, Node nodeTow){
                  inorder(nodeOne);
            return inorder(nodeTow);
    }


}