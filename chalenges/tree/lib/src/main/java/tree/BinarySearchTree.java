package tree;

public class BinarySearchTree {

    Node root;
    boolean bool=false;
    String hello ;
    public BinarySearchTree(){

    }
 public BinarySearchTree(Node root){
        this.root=root;
    }

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


public void addThre(int val,Node nod){
        if (nod==null){
            nod=new Node(val);
        }
        if (val<nod.value){
            if (nod.left==null){
                nod.left=new Node(val);
                return;
            }
            addThre(val,nod.left);
        }
        if (val>nod.value){
            if (nod.rigth==null){
                nod.rigth=new Node(val);
                return;
            }
            addThre(val,nod.rigth);
        }

}
public void search(Node nod1,int nod2){
    if (nod1==null){
        System.out.println("value can not found");
    }
    if (nod2==nod1.value){
        System.out.println("yes");
        return;
    }
    if (nod2>nod1.value){
        search(nod1.rigth,nod2);
    }
    if (nod2<nod1.value){
        search(nod1.left,nod2);
    }


}



public void addTow(Node newNode,Node rootExp){
        if (rootExp==null)
            return;
        if (newNode.value>rootExp.value){
            if (rootExp.rigth==null)
            rootExp.rigth=newNode;
        else
            addTow(newNode,rootExp.rigth);
        }
    if (newNode.value<rootExp.value){
        if (rootExp.left==null)
            rootExp.left=newNode;
    else
        addTow(newNode,rootExp.left);
    }
}
public boolean contain(int data,Node rootExp){
    if (rootExp==null){
//        System.out.println("value can not found");
        return false;
    }
    if (rootExp.value==data){
//        System.out.println("value is found");
        bool=true;
        return true;
    }
    if (data>rootExp.value){
        contain(data,rootExp.rigth);
    }
    if (data<rootExp.value){
        contain(data,rootExp.left);
    }
return bool==true;
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

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                ", bool=" + bool +
                ", hello='" + hello + '\'' +
                '}';
    }
}
