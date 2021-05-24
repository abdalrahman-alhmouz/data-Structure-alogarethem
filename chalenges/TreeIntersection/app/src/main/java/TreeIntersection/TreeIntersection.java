package TreeIntersection;

import java.util.ArrayList;
import java.util.Stack;

public class TreeIntersection{


    static class Node{
        Integer key;
        Node left, right;
    }

    static Node newNode(int ele){
        Node temp = new Node();
        temp.key = ele;
        temp.left = null;
        temp.right = null;
        return temp;
    }

    static ArrayList printCommon(Node root1, Node root2){
        ArrayList<Integer> finaleTree=new ArrayList();
        Stack<Node> s1 = new Stack<Node>();
        Stack<Node> s2 = new Stack<Node>();

        while (true)
        {
            if(root1 != null)
            {
                s1.push(root1);
                root1 = root1.left;
            }
            else if (root2 != null)
            {
                s2.push(root2);
                root2 = root2.left;
            }
            else if (!s1.isEmpty() && !s2.isEmpty())
            {
                root1 = s1.peek();
                root2 = s2.peek();

                if(root1.key == root2.key)
                {
                    System.out.println(root1.key + " ");
                    finaleTree.add(root1.key);
                    s1.pop();
                    s2.pop();

                    root1 = root1.right;
                    root2 = root2.right;
                }
                else if (root1.key < root2.key)
                {
                    s1.pop();
                    root1 = root1.right;
                    root2 = null;
                }
            }
            else break;
        }
        return finaleTree ;
    }

    static void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.println(root.key + " ");
            inorder(root.right);
        }
    }
    static Node insert(Node node, Integer key){
        if(node == null) return newNode(key);

        if(key < node.key) node.left = insert(node.left, key);

        else if (key > node.key) node.right = insert(node.right, key);

        return node;
    }


}