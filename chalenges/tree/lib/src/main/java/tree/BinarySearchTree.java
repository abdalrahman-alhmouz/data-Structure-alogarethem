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



public void addNode(int value,Node roote){

        if (roote==null){
            roote=new Node(value);
            System.out.println("1");
            return;
        }
        if (roote.value>value){
            if (roote.left==null){
                roote.left=new Node(value);
                System.out.println("done");
                return;
            }
            addNode(value,roote.left);
        }

            if (roote.value<value){
                if (roote.rigth==null){
                    roote.rigth=new Node(value);
                    System.out.println("done2");

                    return;
                }
                addNode(value,roote.rigth);
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

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                ", bool=" + bool +
                ", hello='" + hello + '\'' +
                '}';
    }
}
